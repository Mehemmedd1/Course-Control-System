package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.language.Language;
import com.Mehemmed.CourseSystem.Model.payload.language.LanguagePayLoad;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class LanguageEntityMapperImpl implements LanguageEntityMapper {

    @Override
    public Language toEntity(LanguagePayLoad languagePayLoad) {
        if ( languagePayLoad == null ) {
            return null;
        }

        Language.LanguageBuilder<?, ?> language = Language.builder();

        language.name( languagePayLoad.getName() );
        language.icon( languagePayLoad.getIcon() );

        return language.build();
    }

    @Override
    public Language toEntity(LanguagePayLoad languagePayLoad, Long id) {
        if ( languagePayLoad == null && id == null ) {
            return null;
        }

        Language.LanguageBuilder<?, ?> language = Language.builder();

        if ( languagePayLoad != null ) {
            language.name( languagePayLoad.getName() );
            language.icon( languagePayLoad.getIcon() );
        }
        language.id( id );

        return language.build();
    }
}
