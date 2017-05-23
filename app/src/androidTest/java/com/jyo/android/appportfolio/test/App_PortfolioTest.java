package com.jyo.android.appportfolio.test;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.jyo.android.appportfolio.ButtonsMenuActivity;
import com.jyo.android.appportfolio.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.jyo.android.appportfolio.ButtonsMenuActivityFragment.BASE_APP_MESSAGE;
import static com.jyo.android.appportfolio.ButtonsMenuActivityFragment.END_APP_MESSAGE;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class) //
@LargeTest
public class App_PortfolioTest {

    //Define the Activity or class to be tested
    @Rule
    public ActivityTestRule<ButtonsMenuActivity> mActivityRule =
            new ActivityTestRule<>(ButtonsMenuActivity.class);

    private StringBuilder messageConstructor;

    //This annotation will help to perform an action each time before running a test
    @Before
    public void initMessageString() {
        messageConstructor = new StringBuilder(BASE_APP_MESSAGE);
        messageConstructor.append(END_APP_MESSAGE);
    }

    //The specific test (Using AAA pattern)
    @Test
    public void checkPopularMoviesButtonFunctionality() {

        //Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_popular_movies);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        // Type text and then press the button.
        //Act
        onView(withId(R.id.btn_popular_movies))
                .perform(longClick());

        //Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkFootballScoresButtonFunctionality() {

        // Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_duo_scores);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        // Act
        // Type text and then press the button.
        onView(withId(R.id.btn_duo_scores))
                .perform(longClick());

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkLibraryButtonFunctionality() {

        // Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_duo_library);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_duo_library))
                .perform(longClick());

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkBuildItBiggerButtonFunctionality() {

        // Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_build_it_bigger);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_build_bigger))
                .perform(longClick());

        //Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkXYZReaderButtonFunctionality() {

        //Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_xyz_reader);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        //Act
        // Type text and then press the button.
        onView(withId(R.id.btn_xyz_reader))
                .perform(longClick());

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));

    }

    @Test
    public void checkCapstoneButtonFunctionality() {

        //Arrange
        String messageResource = mActivityRule.getActivity().getString(R.string.app_capstone);
        String message = messageConstructor
                .insert(BASE_APP_MESSAGE.length(), messageResource)
                .toString();

        // Type text and then press the button.
        onView(withId(R.id.btn_capstone))
                .perform(longClick());

        // Assert
        onView(allOf(withId(android.support.design.R.id.snackbar_text), withText(message)))
                .check(matches(isDisplayed()));

    }
}