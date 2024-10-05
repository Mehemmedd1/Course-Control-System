package com.Mehemmed.CourseSystem.Model.mappers;


import com.Mehemmed.CourseSystem.Model.Mybatis.country.Country;
import com.Mehemmed.CourseSystem.Model.payload.country.CountryPayload;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryEntityMapper {
    CountryEntityMapper INSTANCE = Mappers.getMapper(CountryEntityMapper.class);




    Country toEntity(CountryPayload countryPayload);
    @Mapping(source = "id", target="id")
    Country toEntity(CountryPayload countryPayload, Long id);
}