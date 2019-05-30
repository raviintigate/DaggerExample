package com.ravi.daggerexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ravi.daggerexample.R;
import com.ravi.daggerexample.api.AuthApiHelper;
import com.ravi.daggerexample.api.ContextModule;
import com.ravi.daggerexample.component.ApiClientComponent;
import com.ravi.daggerexample.component.DaggerApiClientComponent;
import com.ravi.daggerexample.request.UserAuthenticationRequest;
import com.ravi.daggerexample.response.LoginResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

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
            loginFromServer(mobileNumber.getText().toString().trim(), password.getText().toString().trim());
        }
    }

    private void loginFromServer(String mobileNumber, String password) {
        ApiClientComponent component = DaggerApiClientComponent.builder().contextModule(new ContextModule(this)).build();
        AuthApiHelper authApiHelper = component.getAuthApiHelper();

        UserAuthenticationRequest request = new UserAuthenticationRequest();
        String signature = "2ed0dfa8b024819f9467147f129b4ea182ae203e3295d715ce5240bdd7ae2301b3769fd2d923ed966de0898b77d8ce17d0e4d3b52763db01d153d3c54b2b6f6d";
        String userAgent = "79d2ed463da5b266fe518944bada2efa";
        request.setId("481352");
        request.setPassword(password);
        request.setPhoneNo(mobileNumber);
        Call<LoginResponse> call = authApiHelper.UserAuthentication(request, "application/json", "1", userAgent, signature);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                Log.d(TAG, ""+response.body());
                LoginResponse loginResponse = (LoginResponse) response.body();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("data", loginResponse.toString());
                startActivity(intent);
                finish();
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.d(TAG, t.getMessage());
                showToast(t.getMessage());
            }
        });
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
