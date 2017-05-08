package pl.sdacademy.lottery;

import org.junit.Test;

import java.security.InvalidParameterException;

import pl.sdacademy.lottery.model.Coupon;

import static org.junit.Assert.*;

public class CouponUnitTest {
    public final int correctId = 12345678;
    public final int[] correctNumbers = {1,2,3,4,5,49};

    @Test(expected = InvalidParameterException.class)
    public void coupon_tooShortIdThrowsException() throws Exception {
        Coupon coupon = new Coupon(1234567,correctNumbers);
    }

    @Test(expected = InvalidParameterException.class)
    public void coupon_tooLongIdThrowsException() throws Exception {
        Coupon coupon = new Coupon(123456789,correctNumbers);
    }

    @Test(expected = InvalidParameterException.class)
    public void coupon_negativeIdThrowsException() throws Exception {
        Coupon coupon = new Coupon(-1234567,correctNumbers);
    }

    @Test(expected = InvalidParameterException.class)
    public void coupon_tooManyNumbersThrowsException() throws Exception {
        Coupon coupon = new Coupon(correctId,new int[]{1,2,3,4,5,6,7});
    }
    @Test(expected = InvalidParameterException.class)
    public void coupon_notEnoughNumbersThrowsException() throws Exception {
        Coupon coupon = new Coupon(correctId,new int[]{1,2,3,4,5});
    }
    @Test(expected = InvalidParameterException.class)
    public void coupon_outOfRangeNumbersThrowsException() throws Exception {
        Coupon coupon = new Coupon(correctId,new int[]{-1,0,100,50,-49,40});
    }
    @Test(expected = InvalidParameterException.class)
    public void coupon_notUniqueRangeNumbersThrowsException() throws Exception {
        Coupon coupon = new Coupon(correctId,new int[]{1,2,2,3,4,5,6,7});
    }
    @Test(expected = InvalidParameterException.class)
    public void coupon_tooLongDuplicateNumbersThrowsException() throws Exception {
        Coupon coupon = new Coupon(correctId,new int[]{1,2,2,3,4,5,6,7,8});
    }
    @Test
    public void coupon_correctCouponHasCorrectId() throws Exception {
        Coupon coupon = new Coupon(correctId,correctNumbers);
        assertEquals(correctId,coupon.getId());
    }

    @Test
    public void coupon_correctCouponHasCorrectNumbers() throws Exception {
        Coupon coupon = new Coupon(correctId,correctNumbers);
        assertArrayEquals(correctNumbers,coupon.getNumbers());
    }
}