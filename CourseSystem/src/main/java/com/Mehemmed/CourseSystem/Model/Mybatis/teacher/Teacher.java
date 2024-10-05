package com.Mehemmed.CourseSystem.Model.Mybatis.teacher;
import com.Mehemmed.CourseSystem.Model.Mybatis.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Teacher extends BaseEntity<Long> {
    Long userId;
}