package com.Mehemmed.CourseSystem.services.user.settings;
import com.Mehemmed.CourseSystem.services.language.LanguageService;
import com.Mehemmed.CourseSystem.services.userconfig.UserConfigService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserSettingsBusinessServiceImpl implements UserSettingsBusinessService{

    private final LanguageService languageService;
    private final UserConfigService userConfigService;


    @Override
    public void updateUserDefaultLanguage(Long userId, String langId) {

        languageService.findById(Long.valueOf(langId));

        userConfigService.updateUserLanguage(userId,langId);
    }
}