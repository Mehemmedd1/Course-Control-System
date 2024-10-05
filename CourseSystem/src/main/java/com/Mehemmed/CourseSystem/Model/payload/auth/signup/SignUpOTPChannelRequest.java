package com.Mehemmed.CourseSystem.Model.payload.auth.signup;

import com.Mehemmed.CourseSystem.Model.common.proceedkey.ProceedKey;
import com.Mehemmed.CourseSystem.Model.enums.otp.OTPChannel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class SignUpOTPChannelRequest extends ProceedKey {

    private OTPChannel channel;

}