package com.ravi.daggerexample.apiCalling.component;

import com.ravi.daggerexample.apiCalling.api.AuthApiHelper;
import com.ravi.daggerexample.apiCalling.api.GameAuthApiHelper;
import com.ravi.daggerexample.apiCalling.api.RetroApiClient;

import javax.inject.Singleton;
import dagger.Component;


@Singleton
@Component(modules = RetroApiClient.class)
public interface ApiClientComponent {
    AuthApiHelper getAuthApiHelper();
    GameAuthApiHelper getGameAuthApiHelper();
}
