package com.ravi.daggerexample.api;

import com.ravi.daggerexample.request.UserAuthenticationRequest;
import com.ravi.daggerexample.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface GameAuthApiHelper {

    @GET("/api/v1/get-games-v2/")
    Call<LoginResponse> getGameList(@Body UserAuthenticationRequest request,
                                           @Header("content-type") String contentType,
                                           @Header("LangId") String languageId,
                                           @Header("User-Agent") String userAgent,
                                           @Header("Signature") String signature);
}
