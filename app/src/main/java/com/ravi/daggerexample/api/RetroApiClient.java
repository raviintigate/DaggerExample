package com.ravi.daggerexample.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ravi.daggerexample.intercfaces.AppUrls;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = OkHttpClientModule.class)
public class RetroApiClient {

    @Provides
    @Singleton
    public AuthApiHelper getRetroApiClient(@Named("appBasicUrl") Retrofit retrofit) {
        return retrofit.create(AuthApiHelper.class);
    }

    @Provides
    @Singleton
    public GameAuthApiHelper getGameRetroApiClient(@Named("gameBasicUrl") Retrofit retrofit) {
        return retrofit.create(GameAuthApiHelper.class);
    }

    @Singleton
    @Provides
    @Named("appBasicUrl")
    public Retrofit retrofit(GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient, Gson gson, RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {


        return new Retrofit.Builder()
                .client(okHttpClient)
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .baseUrl(AppUrls.APP_BASE_URL)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Singleton
    @Provides
    @Named("gameBasicUrl")
    public Retrofit gameRetrofit(GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient, Gson gson, RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(AppUrls.GAME_BASE_URL)
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }


    @Provides
    public Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    public GsonConverterFactory gsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides
    public RxJava2CallAdapterFactory getRxJava2CallAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }


}
