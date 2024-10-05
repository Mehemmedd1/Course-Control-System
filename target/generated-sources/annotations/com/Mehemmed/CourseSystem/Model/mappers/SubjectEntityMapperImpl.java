package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.subject.Subject;
import com.Mehemmed.CourseSystem.Model.payload.subject.SubjectPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class SubjectEntityMapperImpl implements SubjectEntityMapper {

    @Override
    public Subject fromSubjectPayload(SubjectPayload subjectRequestDto, Long courseId) {
        if ( subjectRequestDto == null && courseId == null ) {
            return null;
        }

        Subject.SubjectBuilder<?, ?> subject = Subject.builder();

        if ( subjectRequestDto != null ) {
            subject.name( subjectRequestDto.getName() );
            subject.languageId( subjectRequestDto.getLanguageId() );
        }
        subject.courseId( courseId );

        return subject.build();
    }

    @Override
    public Subject toEntity(SubjectPayload subjectPayload, long id) {
        if ( subjectPayload == null ) {
            return null;
        }

        Subject.SubjectBuilder<?, ?> subject = Subject.builder();

        if ( subjectPayload != null ) {
            subject.name( subjectPayload.getName() );
            subject.courseId( subjectPayload.getCourseId() );
            subject.languageId( subjectPayload.getLanguageId() );
        }
        subject.id( id );

        return subject.build();
    }
}
