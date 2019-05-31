package com.ravi.daggerexample.apiCalling.api;

import android.content.Context;

import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class PicassoModule {

    @Singleton
    @Provides
public Picasso getPicasso(Context mContext){
    return new Picasso.Builder(mContext).build();
}

}
