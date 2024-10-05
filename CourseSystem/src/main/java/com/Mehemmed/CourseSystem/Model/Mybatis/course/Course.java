package com.Mehemmed.CourseSystem.Model.Mybatis.course;
import com.Mehemmed.CourseSystem.Model.Mybatis.base.BaseEntity;
import com.Mehemmed.CourseSystem.Model.enums.course.CourseStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity<Long> {

    String name;
    CourseStatus status;

}