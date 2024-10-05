package com.Mehemmed.CourseSystem.Model.Mybatis.userconfig;
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
public class UserConfig extends BaseEntity<String> {
    String value;
    Long userId;
}