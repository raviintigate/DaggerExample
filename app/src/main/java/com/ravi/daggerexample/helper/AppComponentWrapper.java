package com.ravi.daggerexample.helper;

import com.ravi.daggerexample.component.ApiClientComponent;
import com.ravi.daggerexample.component.DaggerApiClientComponent;

public class AppComponentWrapper {


    static public ApiClientComponent getApiClientCompoent(){
        return DaggerApiClientComponent.builder().build();
    }




}
