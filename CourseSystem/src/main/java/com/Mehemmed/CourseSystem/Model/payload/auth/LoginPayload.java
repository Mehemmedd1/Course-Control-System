package com.Mehemmed.CourseSystem.Model.payload.auth;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPayload {

    // todo: validation
    String email;
    String password;
    boolean rememberMe;

}