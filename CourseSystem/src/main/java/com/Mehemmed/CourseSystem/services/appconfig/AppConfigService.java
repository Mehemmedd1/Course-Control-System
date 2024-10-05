package com.Mehemmed.CourseSystem.services.appconfig;


import com.Mehemmed.CourseSystem.Model.Mybatis.appconfig.AppConfig;

import java.util.List;

public interface AppConfigService {

    List<AppConfig> findAll();

    AppConfig findById(Long id);

    void insert(AppConfig appConfig);

    void update(AppConfig appConfig);
}