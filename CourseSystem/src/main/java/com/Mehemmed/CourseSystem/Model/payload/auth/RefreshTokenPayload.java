package com.Mehemmed.CourseSystem.Model.payload.auth;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RefreshTokenPayload {

    String refreshToken;
    boolean rememberMe;

}