package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.course.Course;
import com.Mehemmed.CourseSystem.Model.enums.course.CourseStatus;
import com.Mehemmed.CourseSystem.Model.payload.auth.signup.SignUpPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class CourseEntityMapperImpl implements CourseEntityMapper {

    @Override
    public Course fromSignUpPayload(SignUpPayload payload) {
        if ( payload == null ) {
            return null;
        }

        Course.CourseBuilder<?, ?> course = Course.builder();

        course.name( payload.getCourseName() );

        course.status( CourseStatus.ACTIVE );

        return course.build();
    }
}
