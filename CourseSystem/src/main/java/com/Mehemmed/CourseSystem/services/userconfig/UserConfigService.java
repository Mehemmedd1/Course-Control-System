package com.Mehemmed.CourseSystem.services.userconfig;


import com.Mehemmed.CourseSystem.Model.Mybatis.userconfig.UserConfig;

import java.util.List;

public interface UserConfigService {

    void insert(UserConfig userConfig);
    UserConfig findByIdAndUserId(String id, Long userId);

    List<UserConfig> findAll();

    void update(UserConfig userConfig);

    void updateUserLanguage(Long userId, String langId);
}