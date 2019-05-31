package com.ravi.daggerexample.api;

import com.ravi.daggerexample.request.UserAuthenticationRequest;
import com.ravi.daggerexample.response.LoginResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface AuthApiHelper {

    @POST("/api/Auth/UserAuthentication")
    Observable<LoginResponse> UserAuthentication(@Body UserAuthenticationRequest request,
                                                 @Header("content-type") String contentType,
                                                 @Header("LangId") String languageId,
                                                 @Header("User-Agent") String userAgent,
                                                 @Header("Signature") String signature);

}
