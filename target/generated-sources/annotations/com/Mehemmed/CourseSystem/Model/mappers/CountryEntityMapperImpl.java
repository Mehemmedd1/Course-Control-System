package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.country.Country;
import com.Mehemmed.CourseSystem.Model.payload.country.CountryPayload;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class CountryEntityMapperImpl implements CountryEntityMapper {

    @Override
    public Country toEntity(CountryPayload countryPayload) {
        if ( countryPayload == null ) {
            return null;
        }

        Country.CountryBuilder<?, ?> country = Country.builder();

        country.name( countryPayload.getName() );

        return country.build();
    }

    @Override
    public Country toEntity(CountryPayload countryPayload, Long id) {
        if ( countryPayload == null && id == null ) {
            return null;
        }

        Country.CountryBuilder<?, ?> country = Country.builder();

        if ( countryPayload != null ) {
            country.name( countryPayload.getName() );
        }
        country.id( id );

        return country.build();
    }
}
