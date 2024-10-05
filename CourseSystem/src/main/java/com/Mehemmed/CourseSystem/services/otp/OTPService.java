package com.Mehemmed.CourseSystem.services.otp;

import com.Mehemmed.CourseSystem.Model.dto.SendOTPDto;

// Factory Pattern
public interface OTPService {

    void send(SendOTPDto dto);

}