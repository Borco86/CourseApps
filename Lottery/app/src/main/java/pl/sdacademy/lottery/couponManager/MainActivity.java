package pl.sdacademy.lottery.couponManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pl.sdacademy.lottery.R;
import pl.sdacademy.lottery.model.Coupon;
import pl.sdacademy.lottery.service.CouponDataProvider;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_couponNo)
    TextView couponNumberTv;
    @BindView(R.id.tv_result)
    TextView resultTv;
    @BindView(R.id.btn_buy)
    Button buyBtn;
    @BindView(R.id.btn_verify)
    Button verifyBtn;

    private CouponDataProvider couponDataProvider;
    Coupon coupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void setCouponDataProvider(CouponDataProvider couponDataProvider) {
        this.couponDataProvider = couponDataProvider;
    }

    @OnClick(R.id.btn_verify)
    public void onVerifyButton(){
        boolean isCouponWinning = verifyCoupon();
        int couponStringResId =
                isCouponWinning ? R.string.win : R.string.lost;
        resultTv.setText(
                String.format(getString(R.string.lottery_result_format),
                        getString(couponStringResId))
        );
    }

    @OnClick(R.id.btn_buy)
    public void onBuyButton(){
        buyCoupon();
        couponNumberTv.setText(
                String.format(
                        getString(R.string.coupon_number_format),
                        coupon.getId())
        );
    }

    public void buyCoupon(){
        coupon = couponDataProvider.buyCoupon();
    }

    public boolean verifyCoupon(){
        return couponDataProvider.isCuponWinning(coupon);
    }
}
