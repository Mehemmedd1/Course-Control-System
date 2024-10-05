package com.Mehemmed.CourseSystem.Model.payload.language;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LanguagePayLoad {

    String name;
    String icon;
}