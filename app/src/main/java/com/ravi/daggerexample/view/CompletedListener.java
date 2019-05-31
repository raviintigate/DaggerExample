package com.ravi.daggerexample.view;

import com.ravi.daggerexample.model.response.LoginResponse;

/**
 * Created by HaohaoChang on 2017/2/12.
 */
public interface CompletedListener {
    void onCompleted(LoginResponse response);
}
