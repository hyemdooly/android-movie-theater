package woowacourse.movie.view

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import woowacourse.movie.R
import woowacourse.movie.view.moviemain.MovieMainActivity

@RunWith(AndroidJUnit4::class)
class MovieMainActivityTest {
    @get:Rule
    val mActivityTestRule = ActivityScenarioRule(MovieMainActivity::class.java)

    @Test
    fun 예매내역_버튼을_누르면_예매내역_Fragment로_바뀐다() {
        onView(withId(R.id.action_reservation_list)).perform(click())
        onView(withId(R.id.recyclerview)).check(matches(isDisplayed()))
    }

    @Test
    fun 홈_버튼을_누르면_홈_Fragment로_바뀐다() {
        onView(withId(R.id.action_home)).perform(click())
        onView(withId(R.id.movie_recyclerview)).check(matches(isDisplayed()))
    }

    @Test
    fun 설정_버튼을_누르면_설정_Fragment로_바뀐다() {
        onView(withId(R.id.action_setting)).perform(click())
        onView(withId(R.id.setting_toggle)).check(matches(isDisplayed()))
    }
}
