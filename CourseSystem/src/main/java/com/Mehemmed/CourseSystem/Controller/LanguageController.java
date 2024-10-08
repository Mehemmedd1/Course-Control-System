package com.Mehemmed.CourseSystem.Controller;
import com.Mehemmed.CourseSystem.Model.Base.BaseResponse;
import com.Mehemmed.CourseSystem.Model.Mybatis.language.Language;
import com.Mehemmed.CourseSystem.Model.mappers.LanguageEntityMapper;
import com.Mehemmed.CourseSystem.Model.payload.language.LanguagePayLoad;
import com.Mehemmed.CourseSystem.services.language.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/languages")
@RequiredArgsConstructor
public class LanguageController {

    private final LanguageService languageService;


    @PostMapping
    public BaseResponse<Void> insert(@RequestBody LanguagePayLoad languagePayLoad){
        languageService.insert(LanguageEntityMapper.INSTANCE.toEntity(languagePayLoad));
        return BaseResponse.success();
    }
    @PutMapping("/{id}")
    public BaseResponse<Void> update(@PathVariable("id") long id, @RequestBody LanguagePayLoad languagePayLoad){
        languageService.update(LanguageEntityMapper.INSTANCE.toEntity(languagePayLoad, id));
        return BaseResponse.success();
    }

    @GetMapping("/localizable")
    public BaseResponse<List<Language>> getAllLanguagesIsLocalize(){
        return BaseResponse.success(languageService.getAllLanguagesIsLocalize());
    }
}