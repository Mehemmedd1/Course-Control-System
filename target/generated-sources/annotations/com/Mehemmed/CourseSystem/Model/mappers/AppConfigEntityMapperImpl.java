package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.appconfig.AppConfig;
import com.Mehemmed.CourseSystem.Model.response.appconfig.AppConfigResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-05T12:45:44+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class AppConfigEntityMapperImpl implements AppConfigEntityMapper {

    @Override
    public AppConfigResponse fromEntityToPayload(AppConfig appConfig) {
        if ( appConfig == null ) {
            return null;
        }

        AppConfigResponse.AppConfigResponseBuilder appConfigResponse = AppConfigResponse.builder();

        appConfigResponse.value( appConfig.getValue() );
        appConfigResponse.description( appConfig.getDescription() );

        return appConfigResponse.build();
    }

    @Override
    public List<AppConfigResponse> fromEntityToPayload(List<AppConfig> appConfigs) {
        if ( appConfigs == null ) {
            return null;
        }

        List<AppConfigResponse> list = new ArrayList<AppConfigResponse>( appConfigs.size() );
        for ( AppConfig appConfig : appConfigs ) {
            list.add( fromEntityToPayload( appConfig ) );
        }

        return list;
    }
}
