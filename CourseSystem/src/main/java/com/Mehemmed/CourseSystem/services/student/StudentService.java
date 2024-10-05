package com.Mehemmed.CourseSystem.services.student;


import com.Mehemmed.CourseSystem.Model.Mybatis.student.Student;

import java.util.List;

public interface StudentService {
    void insert(Student student);

    void update(Student student);

    Student findById(Long id);

    List<Student> findAll();

    void addStudentToGroup(long id, long groupId);
    boolean checkStudentAlreadyAddedToGroup(long id);

}