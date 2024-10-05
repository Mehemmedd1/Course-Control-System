package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.subject.Subject;
import com.Mehemmed.CourseSystem.Model.payload.subject.SubjectPayload;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubjectEntityMapper {
    SubjectEntityMapper INSTANCE = Mappers.getMapper(SubjectEntityMapper.class);

    @Mapping(target = "courseId", source = "courseId")
    Subject fromSubjectPayload(SubjectPayload subjectRequestDto, Long courseId);

    @Mapping(source = "id", target="id")
    Subject toEntity (SubjectPayload subjectPayload, long id);
}