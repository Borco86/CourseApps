package pl.sdacademy.lottery.couponManager;

/**
 * Created by RENT on 2017-04-27.
 */

public class CouponManagerContract {
    public interface View {
        void setCoupon(String number);

        void setResult(boolean result);
    }

    public interface Presenter {
        void onBuyButton();

        void onVerifyButton();

        void setCouponDataPrivider();
    }
}
