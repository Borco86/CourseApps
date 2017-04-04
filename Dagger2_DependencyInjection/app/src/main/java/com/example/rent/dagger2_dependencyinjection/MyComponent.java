package com.example.rent.dagger2_dependencyinjection;

import dagger.Component;

/**
 * Created by RENT on 2017-04-04.
 */

@Component(modules = MyModule.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);
}
