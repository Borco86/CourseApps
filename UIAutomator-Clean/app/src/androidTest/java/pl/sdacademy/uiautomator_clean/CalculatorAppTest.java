package pl.sdacademy.uiautomator_clean;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.BySelector;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.Until;
import android.util.Log;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
@RunWith(AndroidJUnit4.class)
public class CalculatorAppTest {
    private UiDevice mDevice;
    private final String PACKAGE_NAME = "com.sec.android.app.popupcalculator";
    @Before
    public void setup() throws UiObjectNotFoundException {
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mDevice.pressHome();
        //open calculator application
        startByIntent(PACKAGE_NAME);
    }

    @Test
    public void sumTwoNumbers(){
        mDevice.wait(Until.hasObject(By.res(PACKAGE_NAME,"bt_add")),10000);
        UiObject2 five = mDevice.findObject(By.res(PACKAGE_NAME,"bt_05"));
        UiObject2 plus = mDevice.findObject(By.res(PACKAGE_NAME,"bt_add"));
        UiObject2 equals = mDevice.findObject(By.res(PACKAGE_NAME,"bt_equal"));
        UiObject2 result = mDevice.findObject(By.res(PACKAGE_NAME,"txtCalc"));

        five.click();
        plus.click();
        five.click();
        equals.click();
        Assert.assertEquals("10", result.getText());

    }

    @Test
    public void performEquation(){
        // 4-2*4/2
        Integer operation = 4-(2*4/2) ;
       String operationString = operation.toString();

        mDevice.wait(Until.hasObject(By.res(PACKAGE_NAME,"bt_add")),10000);
        mDevice.wait(Until.hasObject(By.res(PACKAGE_NAME,"bt_mul")),10000);
        mDevice.wait(Until.hasObject(By.res(PACKAGE_NAME,"bt_div")),10000);
        UiObject2 four = mDevice.findObject(By.res(PACKAGE_NAME,"bt_04"));
        UiObject2 two = mDevice.findObject(By.res(PACKAGE_NAME,"bt_02"));
        UiObject2 minus = mDevice.findObject(By.res(PACKAGE_NAME,"bt_sub"));
        UiObject2 multiply = mDevice.findObject(By.res(PACKAGE_NAME,"bt_mul"));
        UiObject2 division = mDevice.findObject(By.res(PACKAGE_NAME,"bt_div"));
        UiObject2 equals = mDevice.findObject(By.res(PACKAGE_NAME,"bt_equal"));
        UiObject2 result = mDevice.findObject(By.res(PACKAGE_NAME,"txtCalc"));

        four.click();
        minus.click();
        two.click();
        multiply.click();
        four.click();
        division.click();
        two.click();
        equals.click();



        Assert.assertEquals(operationString, result.getText());

    }

    public void startByIntent(String packageName){
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

    @After
    public void tearDown() {
        mDevice.pressBack();
    }
}