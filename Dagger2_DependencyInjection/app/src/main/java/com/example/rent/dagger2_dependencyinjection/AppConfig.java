package com.example.rent.dagger2_dependencyinjection;

import android.app.Application;

/**
 * Created by RENT on 2017-04-04.
 */

public class AppConfig extends Application {
    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
