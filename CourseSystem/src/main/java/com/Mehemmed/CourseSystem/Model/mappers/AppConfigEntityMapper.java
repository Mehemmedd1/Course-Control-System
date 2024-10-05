package com.Mehemmed.CourseSystem.Model.mappers;

import com.Mehemmed.CourseSystem.Model.Mybatis.appconfig.AppConfig;
import com.Mehemmed.CourseSystem.Model.response.appconfig.AppConfigResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AppConfigEntityMapper {

    AppConfigEntityMapper INSTANCE = Mappers.getMapper(AppConfigEntityMapper.class);

    AppConfigResponse fromEntityToPayload (AppConfig appConfig);

    List<AppConfigResponse> fromEntityToPayload (List<AppConfig> appConfigs);

}