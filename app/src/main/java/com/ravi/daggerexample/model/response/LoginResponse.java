package com.ravi.daggerexample.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {

    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("expires_in")
    @Expose
    private Integer expiresIn;
    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("remote_api_result")
    @Expose
    private RemoteApiResult remoteApiResult;

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("error_description")
    @Expose
    private String error_description;

    @SerializedName("refresh_token")
    @Expose
    private String refresh_token;




    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }


    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }


    public RemoteApiResult getRemoteApiResult() {
        return remoteApiResult;
    }

    public void setRemoteApiResult(RemoteApiResult remoteApiResult) {
        this.remoteApiResult = remoteApiResult;
    }


    public class RemoteApiResult {

        @SerializedName("Status")
        @Expose
        private Integer status;
        @SerializedName("Response")
        @Expose
        private Response response;
        @SerializedName("ResponseCollection")
        @Expose
        private List<Object> responseCollection = null;
        @SerializedName("MsgKey")
        @Expose
        private String msgKey;
        @SerializedName("FeatureKey")
        @Expose
        private String featureKey;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public RemoteApiResult withStatus(Integer status) {
            this.status = status;
            return this;
        }

        public Response getResponse() {
            return response;
        }

        public void setResponse(Response response) {
            this.response = response;
        }

        public RemoteApiResult withResponse(Response response) {
            this.response = response;
            return this;
        }

        public List<Object> getResponseCollection() {
            return responseCollection;
        }

        public void setResponseCollection(List<Object> responseCollection) {
            this.responseCollection = responseCollection;
        }

        public RemoteApiResult withResponseCollection(List<Object> responseCollection) {
            this.responseCollection = responseCollection;
            return this;
        }

        public String getMsgKey() {
            return msgKey;
        }

        public void setMsgKey(String msgKey) {
            this.msgKey = msgKey;
        }

        public RemoteApiResult withMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }

        public String getFeatureKey() {
            return featureKey;
        }

        public void setFeatureKey(String featureKey) {
            this.featureKey = featureKey;
        }

        public RemoteApiResult withFeatureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }

    }


    public class Response {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("FirstName")
        @Expose
        private String firstName;
        @SerializedName("LastName")
        @Expose
        private String lastName;
        @SerializedName("PhoneNumber")
        @Expose
        private String phoneNumber;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("DateofBirth")
        @Expose
        private String dateofBirth;
        @SerializedName("UserImage")
        @Expose
        private String userImage;
        @SerializedName("UserSessionKey")
        @Expose
        private Object userSessionKey;
        @SerializedName("OnHold")
        @Expose
        private Object onHold;
        @SerializedName("Gender")
        @Expose
        private String gender;
        @SerializedName("RefferCode")
        @Expose
        private String refferCode;
        @SerializedName("Status")
        @Expose
        private String status;
        @SerializedName("IsAddress")
        @Expose
        private Integer isAddress;
        @SerializedName("Age")
        @Expose
        private Integer age;
        @SerializedName("Is_Logged_in")
        @Expose
        private Integer isLoggedIn;
        @SerializedName("Nationality")
        @Expose
        private String nationality;
        @SerializedName("Blocked")
        @Expose
        private String blocked;
        @SerializedName("Landline")
        @Expose
        private Object landline;
        @SerializedName("Cmd")
        @Expose
        private Object cmd;
        @SerializedName("Password")
        @Expose
        private Object password;
        @SerializedName("New_User")
        @Expose
        private String newUser;
        @SerializedName("Check_Hold")
        @Expose
        private String checkHold;
        @SerializedName("EmailVerification")
        @Expose
        private String emailVerification;
        @SerializedName("IsOtpRequired")
        @Expose
        private Integer isOtpRequired;
        @SerializedName("Notification_Msg")
        @Expose
        private Integer notificationMsg;
        @SerializedName("DeviceType")
        @Expose
        private Object deviceType;
        @SerializedName("DeviceId")
        @Expose
        private Object deviceId;
        @SerializedName("RefBy")
        @Expose
        private Object refBy;
        @SerializedName("Income")
        @Expose
        private Object income;
        @SerializedName("IsEmail")
        @Expose
        private Boolean isEmail;
        @SerializedName("IsEmailVerified")
        @Expose
        private Boolean isEmailVerified;
        @SerializedName("AuthenticationToken")
        @Expose
        private Object authenticationToken;

        @SerializedName("LastInfoSyncTime")
        @Expose
        private String LastInfoSyncTime;

        @SerializedName("RefcodeNotAdded")
        @Expose
        private Boolean RefcodeNotAdded;

        public Boolean getRefcodeNotAdded() {
            return RefcodeNotAdded;
        }

        public void setRefcodeNotAdded(Boolean refcodeNotAdded) {
            RefcodeNotAdded = refcodeNotAdded;
        }

        public String getLastInfoSyncTime() {
            return LastInfoSyncTime;
        }

        public void setLastInfoSyncTime(String lastInfoSyncTime) {
            LastInfoSyncTime = lastInfoSyncTime;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Response withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public Response withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Response withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Response withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Response withEmail(String email) {
            this.email = email;
            return this;
        }

        public String getDateofBirth() {
            return dateofBirth;
        }

        public void setDateofBirth(String dateofBirth) {
            this.dateofBirth = dateofBirth;
        }

        public Response withDateofBirth(String dateofBirth) {
            this.dateofBirth = dateofBirth;
            return this;
        }

        public String getUserImage() {
            return userImage;
        }

        public void setUserImage(String userImage) {
            this.userImage = userImage;
        }

        public Response withUserImage(String userImage) {
            this.userImage = userImage;
            return this;
        }

        public Object getUserSessionKey() {
            return userSessionKey;
        }

        public void setUserSessionKey(Object userSessionKey) {
            this.userSessionKey = userSessionKey;
        }

        public Response withUserSessionKey(Object userSessionKey) {
            this.userSessionKey = userSessionKey;
            return this;
        }

        public Object getOnHold() {
            return onHold;
        }

        public void setOnHold(Object onHold) {
            this.onHold = onHold;
        }

        public Response withOnHold(Object onHold) {
            this.onHold = onHold;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Response withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getRefferCode() {
            return refferCode;
        }

        public void setRefferCode(String refferCode) {
            this.refferCode = refferCode;
        }

        public Response withRefferCode(String refferCode) {
            this.refferCode = refferCode;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Response withStatus(String status) {
            this.status = status;
            return this;
        }

        public Integer getIsAddress() {
            return isAddress;
        }

        public void setIsAddress(Integer isAddress) {
            this.isAddress = isAddress;
        }

        public Response withIsAddress(Integer isAddress) {
            this.isAddress = isAddress;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Response withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Integer getIsLoggedIn() {
            return isLoggedIn;
        }

        public void setIsLoggedIn(Integer isLoggedIn) {
            this.isLoggedIn = isLoggedIn;
        }

        public Response withIsLoggedIn(Integer isLoggedIn) {
            this.isLoggedIn = isLoggedIn;
            return this;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public Response withNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public String getBlocked() {
            return blocked;
        }

        public void setBlocked(String blocked) {
            this.blocked = blocked;
        }

        public Response withBlocked(String blocked) {
            this.blocked = blocked;
            return this;
        }

        public Object getLandline() {
            return landline;
        }

        public void setLandline(Object landline) {
            this.landline = landline;
        }

        public Response withLandline(Object landline) {
            this.landline = landline;
            return this;
        }

        public Object getCmd() {
            return cmd;
        }

        public void setCmd(Object cmd) {
            this.cmd = cmd;
        }

        public Response withCmd(Object cmd) {
            this.cmd = cmd;
            return this;
        }

        public Object getPassword() {
            return password;
        }

        public void setPassword(Object password) {
            this.password = password;
        }

        public Response withPassword(Object password) {
            this.password = password;
            return this;
        }

        public String getNewUser() {
            return newUser;
        }

        public void setNewUser(String newUser) {
            this.newUser = newUser;
        }

        public Response withNewUser(String newUser) {
            this.newUser = newUser;
            return this;
        }

        public String getCheckHold() {
            return checkHold;
        }

        public void setCheckHold(String checkHold) {
            this.checkHold = checkHold;
        }

        public Response withCheckHold(String checkHold) {
            this.checkHold = checkHold;
            return this;
        }

        public String getEmailVerification() {
            return emailVerification;
        }

        public void setEmailVerification(String emailVerification) {
            this.emailVerification = emailVerification;
        }

        public Response withEmailVerification(String emailVerification) {
            this.emailVerification = emailVerification;
            return this;
        }

        public Integer getIsOtpRequired() {
            return isOtpRequired;
        }

        public void setIsOtpRequired(Integer isOtpRequired) {
            this.isOtpRequired = isOtpRequired;
        }

        public Response withIsOtpRequired(Integer isOtpRequired) {
            this.isOtpRequired = isOtpRequired;
            return this;
        }

        public Integer getNotificationMsg() {
            return notificationMsg;
        }

        public void setNotificationMsg(Integer notificationMsg) {
            this.notificationMsg = notificationMsg;
        }

        public Response withNotificationMsg(Integer notificationMsg) {
            this.notificationMsg = notificationMsg;
            return this;
        }

        public Object getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(Object deviceType) {
            this.deviceType = deviceType;
        }

        public Response withDeviceType(Object deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public Object getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(Object deviceId) {
            this.deviceId = deviceId;
        }

        public Response withDeviceId(Object deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Object getRefBy() {
            return refBy;
        }

        public void setRefBy(Object refBy) {
            this.refBy = refBy;
        }

        public Response withRefBy(Object refBy) {
            this.refBy = refBy;
            return this;
        }

        public Object getIncome() {
            return income;
        }

        public void setIncome(Object income) {
            this.income = income;
        }

        public Response withIncome(Object income) {
            this.income = income;
            return this;
        }

        public Boolean getIsEmail() {
            return isEmail;
        }

        public void setIsEmail(Boolean isEmail) {
            this.isEmail = isEmail;
        }

        public Response withIsEmail(Boolean isEmail) {
            this.isEmail = isEmail;
            return this;
        }

        public Boolean getIsEmailVerified() {
            return isEmailVerified;
        }

        public void setIsEmailVerified(Boolean isEmailVerified) {
            this.isEmailVerified = isEmailVerified;
        }

        public Response withIsEmailVerified(Boolean isEmailVerified) {
            this.isEmailVerified = isEmailVerified;
            return this;
        }

        public Object getAuthenticationToken() {
            return authenticationToken;
        }

        public void setAuthenticationToken(Object authenticationToken) {
            this.authenticationToken = authenticationToken;
        }

        public Response withAuthenticationToken(Object authenticationToken) {
            this.authenticationToken = authenticationToken;
            return this;
        }

    }

}
