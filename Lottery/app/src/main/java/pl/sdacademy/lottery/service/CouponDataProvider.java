package pl.sdacademy.lottery.service;

import pl.sdacademy.lottery.model.Coupon;

/**
 * Created by Admin on 27.04.2017.
 */

public interface CouponDataProvider {
    Coupon buyCoupon();
    boolean isCuponWinning(Coupon coupon);
}
