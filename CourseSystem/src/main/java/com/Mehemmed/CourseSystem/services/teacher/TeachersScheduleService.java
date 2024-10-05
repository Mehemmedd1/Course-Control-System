package com.Mehemmed.CourseSystem.services.teacher;


import com.Mehemmed.CourseSystem.Model.Mybatis.teacher.TeachersSchedule;

import java.util.List;

public interface TeachersScheduleService {
    void insert(TeachersSchedule teachersSchedule);

    TeachersSchedule findById(Long id);

    List<TeachersSchedule> findAll();

    void update(TeachersSchedule teachersSchedule);
}