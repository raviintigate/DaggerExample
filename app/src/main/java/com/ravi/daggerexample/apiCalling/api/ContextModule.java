package com.ravi.daggerexample.apiCalling.api;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    public Context mContext;

    public ContextModule(Context mContext){
        this.mContext=mContext;
    }
    @Provides
    @Singleton
    public Context getContext(){
        return mContext.getApplicationContext();
    }


}
