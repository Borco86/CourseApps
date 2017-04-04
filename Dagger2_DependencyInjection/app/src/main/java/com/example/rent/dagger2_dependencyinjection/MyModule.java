package com.example.rent.dagger2_dependencyinjection;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RENT on 2017-04-04.
 */
@Module
public class MyModule {

    @Provides
    public SimpleObject providesSimpleObject(SecondObject secondObject) {
        return new SimpleObject("To jest obiekt wstrzykiwany globalnie", secondObject);
    }

    @Provides
    public SecondObject providesSecondObject() {
        return new SecondObject("To jest drugi obiekt/zależność");
    }

}
