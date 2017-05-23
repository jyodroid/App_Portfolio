package com.jyo.android.appportfolio.test

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.longClick
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.jyo.android.appportfolio.ButtonsMenuActivity
import com.jyo.android.appportfolio.ButtonsMenuActivityFragment.BASE_APP_MESSAGE
import com.jyo.android.appportfolio.ButtonsMenuActivityFragment.END_APP_MESSAGE
import com.jyo.android.appportfolio.R
import org.hamcrest.Matchers.allOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by johntangarife on 5/23/17.
 */

@RunWith(AndroidJUnit4::class)
@LargeTest
class App_PortfolioKotlinTest {

    @get:Rule
    var mActivityRule = ActivityTestRule(ButtonsMenuActivity::class.java)

    private var messageConstructor: StringBuilder? = null

    @Before
    fun initMessageString() {
        messageConstructor = StringBuilder(BASE_APP_MESSAGE).append(END_APP_MESSAGE)
    }

    @Test
    fun checkPopularMoviesButtonFunctionality() {

        //Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_popular_movies)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        //Act
        onView(withId(R.id.btn_popular_movies))
                .perform(longClick())

        //Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))
    }

    @Test
    fun checkFootballScoresButtonFunctionality() {

        // Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_duo_scores)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        // Act
        // Type text and then press the button.
        onView(withId(R.id.btn_duo_scores))
                .perform(longClick())

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))
    }

    @Test
    fun checkLibraryButtonFunctionality() {

        // Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_duo_library)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_duo_library))
                .perform(longClick())

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))
    }

    @Test
    fun checkBuildItBiggerButtonFunctionality() {

        // Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_build_it_bigger)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_build_bigger))
                .perform(longClick())

        //Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))
    }

    @Test
    fun checkXYZReaderButtonFunctionality() {

        //Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_xyz_reader)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_xyz_reader))
                .perform(longClick())

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))

    }

    @Test
    fun checkCapstoneButtonFunctionality() {

        //Arrange
        val messageResource = mActivityRule.activity.getString(R.string.app_capstone)
        val message = messageConstructor?.insert(BASE_APP_MESSAGE.length, messageResource).toString()

        // Type text and then press the button.
        onView(withId(R.id.btn_capstone))
                .perform(longClick())

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()))

    }
}