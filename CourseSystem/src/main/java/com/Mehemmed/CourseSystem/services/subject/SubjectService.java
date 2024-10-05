package com.Mehemmed.CourseSystem.services.subject;


import com.Mehemmed.CourseSystem.Model.Mybatis.subject.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> findAll();
    Subject findById(Long id);
    void  insert(Subject subject);
    void update (Subject subject);
}