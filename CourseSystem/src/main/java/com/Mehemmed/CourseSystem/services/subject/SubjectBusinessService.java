package com.Mehemmed.CourseSystem.services.subject;


import com.Mehemmed.CourseSystem.Model.payload.subject.SubjectPayload;

public interface SubjectBusinessService {
    void insertSubject(SubjectPayload subjectPayload);

    void editSubject(long id,SubjectPayload subjectPayload);
}