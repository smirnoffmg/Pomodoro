package com.smirnoffmg.pomodorotimer

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SmokeTest {
    @Test
    fun mainActivityLaunches() {
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            // If the activity launches and is in RESUMED state, the test passes
            // Optionally, check state
            assert(scenario.state.isAtLeast(androidx.lifecycle.Lifecycle.State.RESUMED))
        }
    }
}
