package com.Mehemmed.CourseSystem.services.student;

import com.Mehemmed.CourseSystem.Model.payload.student.StudentPayload;

public interface StudentBusinessService {

    void addStudent(StudentPayload studentPayload);

    void addStudentToGroup(long studentId, long groupId);
}