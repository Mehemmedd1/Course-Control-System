package com.Mehemmed.CourseSystem.services.security;
import com.Mehemmed.CourseSystem.Model.common.proceedkey.ProceedKey;
import com.Mehemmed.CourseSystem.Model.payload.auth.LoginPayload;
import com.Mehemmed.CourseSystem.Model.payload.auth.RefreshTokenPayload;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpPayload;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpOTPChannelRequest;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpOTPRequest;
import com.Mehemmed.CourseSystem.Model.response.auth.LoginResponse;

public interface AuthBusinessService {

    LoginResponse login(LoginPayload payload);

    LoginResponse refresh(RefreshTokenPayload payload);

    void logout();

    ProceedKey signUp(SignUpPayload payload);

    void signUpOTP(SignUpOTPChannelRequest payload);

    void signUpOTPConfirmation(SignUpOTPRequest payload);

    void setAuthentication(String email);

}