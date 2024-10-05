package com.Mehemmed.CourseSystem.Repository;

import com.Mehemmed.CourseSystem.Model.Mybatis.teacher.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;


@Mapper
public interface TeacherRepository {
    void insert(Teacher teacher);

    void update(Teacher teacher);

    Optional<Teacher> findById(Long id);

    List<Teacher> findAll();
}