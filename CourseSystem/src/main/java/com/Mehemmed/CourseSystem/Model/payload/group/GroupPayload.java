package com.Mehemmed.CourseSystem.Model.payload.group;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GroupPayload {
    String name;
}