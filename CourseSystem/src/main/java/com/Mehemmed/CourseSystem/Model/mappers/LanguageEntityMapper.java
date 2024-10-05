package com.Mehemmed.CourseSystem.Model.mappers;
import com.Mehemmed.CourseSystem.Model.Mybatis.language.Language;
import com.Mehemmed.CourseSystem.Model.payload.language.LanguagePayLoad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageEntityMapper {

    LanguageEntityMapper INSTANCE = Mappers.getMapper(LanguageEntityMapper.class);

    Language toEntity(LanguagePayLoad languagePayLoad);

    @Mapping(source = "id", target="id")
    Language toEntity(LanguagePayLoad languagePayLoad, Long id);
}