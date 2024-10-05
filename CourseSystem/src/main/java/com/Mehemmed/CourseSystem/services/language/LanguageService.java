package com.Mehemmed.CourseSystem.services.language;


import com.Mehemmed.CourseSystem.Model.Mybatis.language.Language;

import java.util.List;

public interface LanguageService {

    void insert(Language language);
    List<Language> findAll();
    Language findById(Long id);
    void update (Language language);

    Language getDefaultLanguage();

    List<Language> getAllLanguagesIsLocalize();
}