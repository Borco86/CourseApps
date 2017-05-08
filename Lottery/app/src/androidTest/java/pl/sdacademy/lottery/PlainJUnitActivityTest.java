package pl.sdacademy.lottery;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import pl.sdacademy.lottery.couponManager.MainActivity;
import pl.sdacademy.lottery.model.Coupon;
import pl.sdacademy.lottery.service.CouponDataProvider;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class PlainJUnitActivityTest {

    public final Coupon correctCoupon = new Coupon(12345678,
            new int[]{1,2,3,4,5,6});
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new
            ActivityTestRule<>(MainActivity.class);
    MainActivity activity;

    @Before
    public void initActivity(){
        activity = activityTestRule.getActivity();
    }

    @Test
    public void activity_buyGivesCorrectCoupon() throws Exception {

        CouponDataProvider dataProvider = mock(CouponDataProvider.class);
        when(dataProvider.buyCoupon()).thenReturn(correctCoupon);
        activity.setCouponDataProvider(dataProvider);
        activity.buyCoupon();
        assertEquals(correctCoupon,activity.coupon);
    }

    @Test
    public void activity_verifyOnWinningCouponReturnsTrue() throws Exception {
        verifyOnWinningCouponReturnsExpected(true);
    }


    @Test
    public void activity_verifyOnWinningCouponReturnsFalse() throws Exception {
        verifyOnWinningCouponReturnsExpected(false);
    }

    public void verifyOnWinningCouponReturnsExpected(boolean expected){
        CouponDataProvider dataProvider = mock(CouponDataProvider.class);
        when(dataProvider.buyCoupon()).thenReturn(correctCoupon);
        when(dataProvider.isCuponWinning(any(Coupon.class))).
                thenReturn(expected);
        activity.setCouponDataProvider(dataProvider);
        activity.buyCoupon();
        assertEquals(expected,activity.verifyCoupon());
    }
}
