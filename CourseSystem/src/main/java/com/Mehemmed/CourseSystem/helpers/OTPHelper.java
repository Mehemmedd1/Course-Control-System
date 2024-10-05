package com.Mehemmed.CourseSystem.helpers;

import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.services.redis.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.Mehemmed.CourseSystem.Model.enums.response.ErrorResponseMessages.OTP_IS_NOT_VALID;


@Component
@RequiredArgsConstructor
public class OTPHelper {

    private final RedisService redisService;

    public String generate() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }

    public void isValid(String key, String otp) {

        String storedOtp = redisService.get(key);

        if (storedOtp == null || !storedOtp.equals(otp)) {
            throw BaseException.of(OTP_IS_NOT_VALID);
        }

    }

}