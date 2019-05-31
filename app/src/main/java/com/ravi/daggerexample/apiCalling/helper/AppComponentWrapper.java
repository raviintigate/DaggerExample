package com.ravi.daggerexample.apiCalling.helper;

import com.ravi.daggerexample.apiCalling.component.ApiClientComponent;
import com.ravi.daggerexample.apiCalling.component.DaggerApiClientComponent;

public class AppComponentWrapper {


    static public ApiClientComponent getApiClientCompoent(){
        return DaggerApiClientComponent.builder().build();
    }




}
