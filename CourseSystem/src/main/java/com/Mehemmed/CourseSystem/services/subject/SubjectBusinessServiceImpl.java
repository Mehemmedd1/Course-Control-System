package com.Mehemmed.CourseSystem.services.subject;
import com.Mehemmed.CourseSystem.Model.mappers.SubjectEntityMapper;
import com.Mehemmed.CourseSystem.Model.payload.subject.SubjectPayload;
import com.Mehemmed.CourseSystem.services.language.LanguageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectBusinessServiceImpl implements SubjectBusinessService {
    final SubjectService subjectService;
    final LanguageService languageService;

    @Override
    public void insertSubject(SubjectPayload subjectPayload) {
        languageService.findById(subjectPayload.getLanguageId());
        subjectService.insert(SubjectEntityMapper.INSTANCE.fromSubjectPayload(subjectPayload, 1L));
    }

    @Override
    public void editSubject(long id, SubjectPayload subjectPayload) {
        subjectService.update(SubjectEntityMapper.INSTANCE.toEntity(subjectPayload,id));
    }


}