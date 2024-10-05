package com.Mehemmed.CourseSystem.Controller;

import com.Mehemmed.CourseSystem.Model.Base.BaseResponse;
import com.Mehemmed.CourseSystem.Model.common.proceedkey.ProceedKey;
import com.Mehemmed.CourseSystem.Model.payload.auth.LoginPayload;
import com.Mehemmed.CourseSystem.Model.payload.auth.RefreshTokenPayload;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpOTPChannelRequest;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpOTPRequest;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpPayload;
import com.Mehemmed.CourseSystem.Model.response.auth.LoginResponse;
import com.Mehemmed.CourseSystem.services.security.AuthBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthBusinessService authBusinessService;

    @PostMapping("/login")
    public BaseResponse<LoginResponse> login(@RequestBody LoginPayload payload) {
        return BaseResponse.success(authBusinessService.login(payload));
    }

    @PostMapping("/token/refresh")
    public BaseResponse<LoginResponse> refresh(@RequestBody RefreshTokenPayload payload) {
        return BaseResponse.success(authBusinessService.refresh(payload));
    }

    @PostMapping("/logout")
    public BaseResponse<Void> logout() {
        authBusinessService.logout();
        return BaseResponse.success();
    }

    @PostMapping("/sign-up")
    public BaseResponse<ProceedKey> signUp(@RequestBody SignUpPayload payload) {
        return BaseResponse.success(authBusinessService.signUp(payload));
    }

    // use proceedKey
    @PostMapping("/sign-up/otp/request")
    public BaseResponse<Void> otpRequest(@RequestBody SignUpOTPChannelRequest payload) {
        authBusinessService.signUpOTP(payload);
        return BaseResponse.success();
    }

    @PostMapping("/sign-up/otp/confirmation")
    public BaseResponse<Void> otpConfirmation(@RequestBody SignUpOTPRequest payload) {
        authBusinessService.signUpOTPConfirmation(payload);
        return BaseResponse.success();
    }

}