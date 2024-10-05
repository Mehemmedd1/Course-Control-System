package com.Mehemmed.CourseSystem.Controller;
import com.Mehemmed.CourseSystem.Model.Base.BaseResponse;
import com.Mehemmed.CourseSystem.Model.mappers.AppConfigEntityMapper;
import com.Mehemmed.CourseSystem.Model.response.appconfig.AppConfigResponse;
import com.Mehemmed.CourseSystem.services.appconfig.AppConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/appconfig")
@RequiredArgsConstructor
public class AppConfigController {

    private final AppConfigService appConfigService;

    @GetMapping("/{id}")
    public BaseResponse<AppConfigResponse> findAppConfigById(@PathVariable("id") long id) {
        return BaseResponse.success(AppConfigEntityMapper.INSTANCE.fromEntityToPayload(appConfigService.findById(id)));
    }

    @GetMapping
    public BaseResponse<List<AppConfigResponse>> getAllAppConfigs() {
        return BaseResponse.success(AppConfigEntityMapper.INSTANCE.fromEntityToPayload(appConfigService.findAll()));
    }
}