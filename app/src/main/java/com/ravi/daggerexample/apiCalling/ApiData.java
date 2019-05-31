package com.ravi.daggerexample.apiCalling;

import com.ravi.daggerexample.apiCalling.Ignore.LoginRequestNew;
import com.ravi.daggerexample.apiCalling.helper.AppComponentWrapper;
import com.ravi.daggerexample.model.response.LoginResponse;


import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class ApiData {

    public   DisposableObserver<LoginResponse> getLoginResponse(DisposableObserver<LoginResponse> subscriber, String mobileNumber, String password) {
        return AppComponentWrapper.getApiClientCompoent().getAuthApiHelper()
                .UserAuthentication(LoginRequestNew.getLoginCredentials(mobileNumber, password), "application/json", "1", LoginRequestNew.userAgent, LoginRequestNew.signature)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(subscriber);

    }

}
