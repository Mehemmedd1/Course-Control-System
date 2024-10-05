package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.group.Group;
import com.Mehemmed.CourseSystem.Model.payload.group.GroupPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class GroupEntityMapperImpl implements GroupEntityMapper {

    @Override
    public Group toEntity(GroupPayload groupPayload) {
        if ( groupPayload == null ) {
            return null;
        }

        Group.GroupBuilder<?, ?> group = Group.builder();

        group.name( groupPayload.getName() );

        return group.build();
    }

    @Override
    public Group toEntity(GroupPayload groupPayload, Long id) {
        if ( groupPayload == null && id == null ) {
            return null;
        }

        Group.GroupBuilder<?, ?> group = Group.builder();

        if ( groupPayload != null ) {
            group.name( groupPayload.getName() );
        }
        group.id( id );

        return group.build();
    }
}
