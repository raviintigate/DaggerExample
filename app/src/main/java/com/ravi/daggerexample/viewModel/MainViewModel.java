package com.ravi.daggerexample.viewModel;

import com.ravi.daggerexample.apiCalling.ApiData;
import com.ravi.daggerexample.model.response.LoginResponse;
import com.ravi.daggerexample.view.CompletedListener;

import io.reactivex.observers.DisposableObserver;


public class MainViewModel {


    private DisposableObserver<LoginResponse> subscriber;
    DisposableObserver<LoginResponse> loginResponseObservable;
    private String mobile,password;
    private CompletedListener listener;

    public MainViewModel(CompletedListener listener, String mobile, String pass) {
        this.listener=listener;
        this.mobile=mobile;
        this.password=pass;
        getLoginData();
    }


    private void getLoginData() {
        subscriber = new DisposableObserver<LoginResponse>() {


            @Override
            public void onNext(LoginResponse loginResponse) {
                listener.onCompleted(loginResponse);

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        };

        loginResponseObservable = new ApiData().getLoginResponse(subscriber, mobile, password);
    }


}
