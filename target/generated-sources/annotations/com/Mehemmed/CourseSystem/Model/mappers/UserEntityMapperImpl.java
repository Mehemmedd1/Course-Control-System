package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.user.User;
import com.Mehemmed.CourseSystem.Model.enums.user.UserStatus;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpPayload;
import com.Mehemmed.CourseSystem.Model.payload.student.StudentPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public User fromSignUpPayloadToUser(SignUpPayload payload, String encryptedPassword, Long roleId) {
        if ( payload == null && encryptedPassword == null && roleId == null ) {
            return null;
        }

        User.UserBuilder<?, ?> user = User.builder();

        if ( payload != null ) {
            user.name( payload.getName() );
            user.surname( payload.getSurname() );
            user.email( payload.getEmail() );
            user.phoneNumber( payload.getPhoneNumber() );
        }
        user.password( encryptedPassword );
        user.roleId( roleId );
        user.status( UserStatus.ACTIVE );

        return user.build();
    }

    @Override
    public User fromStudentPayloadToUser(StudentPayload studentPayload, String encryptedPassword, Long roleId) {
        if ( studentPayload == null && encryptedPassword == null && roleId == null ) {
            return null;
        }

        User.UserBuilder<?, ?> user = User.builder();

        if ( studentPayload != null ) {
            user.name( studentPayload.getName() );
            user.surname( studentPayload.getSurname() );
            user.email( studentPayload.getEmail() );
            user.phoneNumber( studentPayload.getPhoneNumber() );
        }
        user.password( encryptedPassword );
        user.roleId( roleId );
        user.status( UserStatus.ACTIVE );

        return user.build();
    }
}
