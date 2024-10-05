package com.Mehemmed.CourseSystem.Model.Mybatis.student;

import com.Mehemmed.CourseSystem.Model.Mybatis.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends BaseEntity<Long> {

    Long userId;

}