package com.ravi.daggerexample.component;

import com.ravi.daggerexample.api.AuthApiHelper;
import com.ravi.daggerexample.api.GameAuthApiHelper;
import com.ravi.daggerexample.api.PicassoModule;
import com.ravi.daggerexample.api.RetroApiClient;
import com.squareup.picasso.Picasso;
import javax.inject.Singleton;
import dagger.Component;


@Singleton
@Component(modules = {RetroApiClient.class, PicassoModule.class})
public interface ApiClientComponent {
    AuthApiHelper getAuthApiHelper();
    GameAuthApiHelper getGameAuthApiHelper();
    Picasso getPicasso();
}
