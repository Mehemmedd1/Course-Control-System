package com.Mehemmed.CourseSystem.Model.Mybatis.country;
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
public class Country extends BaseEntity<Long> {
    String name;
}