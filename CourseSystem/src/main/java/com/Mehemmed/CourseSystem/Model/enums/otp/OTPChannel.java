package com.Mehemmed.CourseSystem.Model.enums.otp;


import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.user.User;

public enum OTPChannel {
    SMS, EMAIL;

    public String getTarget(User user) {
        if (this.equals(SMS)) {
            return user.getPhoneNumber();
        } else if (this.equals(EMAIL)) {
            return user.getEmail();
        } else {
            throw BaseException.unexpected();
        }
    }
}