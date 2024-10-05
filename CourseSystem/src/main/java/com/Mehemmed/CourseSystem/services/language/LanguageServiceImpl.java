package com.Mehemmed.CourseSystem.services.language;
import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.language.Language;
import com.Mehemmed.CourseSystem.Repository.LanguageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    @Override
    public void insert(Language language) {
        languageRepository.insert(language);
    }

    @Override
    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    @Override
    public Language findById(Long id) {
        return languageRepository.findById(id).orElseThrow(() -> BaseException.notFound(Language.class.getSimpleName(), "language", String.valueOf(id)));
    }

    @Override
    public void update(Language language) {
        languageRepository.update(language);

    }

    @Override
    public Language getDefaultLanguage() {
        return languageRepository.getDefaultLanguage().orElseThrow(
                BaseException::unexpected
        );
    }

    @Override
    public List<Language> getAllLanguagesIsLocalize() {
        return languageRepository.getAllLanguagesIsLocalize();
    }

}