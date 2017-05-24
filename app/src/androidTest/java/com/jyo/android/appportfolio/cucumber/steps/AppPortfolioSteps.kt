package com.jyo.android.appportfolio.cucumber.steps

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.PowerManager
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.registerIdlingResources
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.jyo.android.appportfolio.ButtonsMenuActivity
import com.jyo.android.appportfolio.R
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.hamcrest.Matchers
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Created by johntangarife on 5/23/17.
 */
@RunWith(AndroidJUnit4::class)
class AppPortfolioSteps {

    @Rule
    private var mActivityRule = ActivityTestRule(ButtonsMenuActivity::class.java)

    private var mInstrumentationContext: Context? = null
    private var mAppContext: Context? = null
    private var mActivity: Activity? = null
    private var mFullWakeUpLock: PowerManager.WakeLock? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mInstrumentationContext = InstrumentationRegistry.getContext()
        mAppContext = InstrumentationRegistry.getTargetContext()
        registerIdlingResources()
        mActivity = mActivityRule.launchActivity(Intent()) // Start Activity before each test scenario
        assertNotNull(mActivity)
        turnOnScreenOfTestDevice()
    }

    private fun turnOnScreenOfTestDevice() {
        val powerManager = mActivity?.getSystemService(Context.POWER_SERVICE) as PowerManager

        mFullWakeUpLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK or PowerManager.ACQUIRE_CAUSES_WAKEUP, "FULL WAKE UP LOCK")
        // This will turn on the screen during the test (lock screen still needs to be always disabled)
        mFullWakeUpLock?.acquire()
    }

    @Given("^I Am on Portfolio app$")
    @Throws(Throwable::class)
    fun iAmOnPortfolioApp() {
        assert(true)
    }

    @When("^I click on Popular Movie Button$")
    @Throws(Throwable::class)
    fun iClickOnPopularMovieButton() {
        onView(ViewMatchers.withId(com.jyo.android.appportfolio.R.id.btn_popular_movies))
                .perform(ViewActions.longClick())
    }

    @Then("^I should see \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun iShouldSee(message: String) {
        onView(Matchers.allOf(ViewMatchers.withId(R.id.snackbar_text), ViewMatchers.withText(message)))
                .check(matches(ViewMatchers.isDisplayed()))
    }
}
