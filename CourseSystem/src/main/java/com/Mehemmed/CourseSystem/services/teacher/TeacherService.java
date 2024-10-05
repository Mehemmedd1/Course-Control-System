package com.Mehemmed.CourseSystem.services.teacher;

import com.Mehemmed.CourseSystem.Model.Mybatis.teacher.Teacher;

import java.util.List;

public interface TeacherService {
    void insert(Teacher teacher);

    void update(Teacher teacher);

    Teacher findById(Long id);

    List<Teacher> findAll();
}