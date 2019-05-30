package com.ravi.daggerexample.Ignore;

import com.ravi.daggerexample.request.UserAuthenticationRequest;

public class LoginRequest {
    public static final String signature = "2ed0dfa8b024819f9467147f129b4ea182ae203e3295d715ce5240bdd7ae2301b3769fd2d923ed966de0898b77d8ce17d0e4d3b52763db01d153d3c54b2b6f6d";
    public static final String userAgent = "79d2ed463da5b266fe518944bada2efa";
    public static UserAuthenticationRequest getLoginCredentials(String mobileNumber, String password) {
        UserAuthenticationRequest request = new UserAuthenticationRequest();

        request.setId("481352");
        request.setPassword(password);
        request.setPhoneNo(mobileNumber);
        return request;
    }
}
