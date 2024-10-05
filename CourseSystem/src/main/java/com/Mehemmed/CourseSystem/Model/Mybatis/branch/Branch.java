package com.Mehemmed.CourseSystem.Model.Mybatis.branch;
import com.Mehemmed.CourseSystem.Model.Mybatis.base.BaseEntity;
import com.Mehemmed.CourseSystem.Model.enums.branch.BranchStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Branch extends BaseEntity<Long> {

    String name;
    BranchStatus status;
    String address;
    Double lat;
    Double lon;
    Long courseId;

}