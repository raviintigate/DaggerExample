package com.ravi.daggerexample.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.ravi.daggerexample.R;
import com.ravi.daggerexample.model.response.LoginResponse;
import com.ravi.daggerexample.viewModel.MainViewModel;

import io.reactivex.observers.DisposableObserver;

public class LoginActivity extends AppCompatActivity implements CompletedListener {
    private static final String TAG = "LoginActivity";

    DisposableObserver<LoginResponse> observable_loginRequest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViewById(R.id.btn_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyData();
            }
        });
    }

    private void verifyData() {
        EditText password = findViewById(R.id.password);
        EditText mobileNumber = findViewById(R.id.txt_mobile);
        if (TextUtils.isEmpty(mobileNumber.getText().toString().trim())) {
            showToast("Enter mobile number");
        } else if (TextUtils.isEmpty(password.getText().toString().trim())) {
            showToast("Enter password");
        } else {
           new MainViewModel(this, "123456789", "123456");

        }
    }


//    public Observable<LoginResponse> getObservable(String mobileNumber, String password) {
//        return AppComponentWrapper.getApiClientCompoent().getAuthApiHelper()
//                .UserAuthentication(LoginRequestNew.getLoginCredentials(mobileNumber, password), "application/json", "1", LoginRequestNew.userAgent, LoginRequestNew.signature)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//    }

//    public DisposableObserver<LoginResponse> getObserver() {
//        return new DisposableObserver<LoginResponse>() {
//
//            @Override
//            public void onNext(@NonNull LoginResponse loginResponse) {
//
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//                Log.d(TAG, "Error" + e);
//                e.printStackTrace();
//                Log.d(TAG, e.getMessage());
//                showToast(e.getMessage());
//            }
//
//            @Override
//            public void onComplete() {
//                Log.d(TAG, "Completed");
//            }
//        };
//    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (observable_loginRequest != null && !observable_loginRequest.isDisposed()) {
            observable_loginRequest.dispose();
        }

    }

    @Override
    public void onCompleted(LoginResponse loginResponse) {
        if (loginResponse != null) {
            Log.d(TAG, "" + loginResponse.getAccessToken());
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("data", loginResponse.toString());
            startActivity(intent);
            finish();

        }
    }
}
