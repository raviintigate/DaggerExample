package com.ravi.daggerexample.apiCalling.api;

import com.ravi.daggerexample.model.request.UserAuthenticationRequest;
import com.ravi.daggerexample.model.response.LoginResponse;

import io.reactivex.Observable;
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
