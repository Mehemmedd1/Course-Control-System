package com.Mehemmed.CourseSystem.Repository;
import com.Mehemmed.CourseSystem.Model.Mybatis.teacher.TeachersSchedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TeachersScheduleRepository {
    void insert(TeachersSchedule teachersSchedule);
    Optional<TeachersSchedule> findById(Long id);
    List<TeachersSchedule> findAll();
    void update(TeachersSchedule teachersSchedule);
}