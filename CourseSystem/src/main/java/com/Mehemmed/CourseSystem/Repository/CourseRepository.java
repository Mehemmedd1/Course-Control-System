package com.Mehemmed.CourseSystem.Repository;


import com.Mehemmed.CourseSystem.Model.Mybatis.course.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseRepository {

    void insert(Course course);

}