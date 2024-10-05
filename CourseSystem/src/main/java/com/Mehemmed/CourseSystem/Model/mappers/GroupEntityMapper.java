package com.Mehemmed.CourseSystem.Model.mappers;


import com.Mehemmed.CourseSystem.Model.Mybatis.group.Group;
import com.Mehemmed.CourseSystem.Model.payload.group.GroupPayload;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GroupEntityMapper {

    GroupEntityMapper INSTANCE = Mappers.getMapper(GroupEntityMapper.class);

    Group toEntity (GroupPayload groupPayload);

    @Mapping(source = "id", target="id")
    Group toEntity (GroupPayload groupPayload, Long id);

}