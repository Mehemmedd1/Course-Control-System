package com.Mehemmed.CourseSystem.services.teacher;


import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.teacher.Teacher;
import com.Mehemmed.CourseSystem.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{

    private final TeacherRepository teacherRepository;

    @Override
    public void insert(Teacher teacher) {
        teacherRepository.insert(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.update(teacher);
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id).orElseThrow(
                () -> BaseException.notFound(Teacher.class.getSimpleName(), "teacher", String.valueOf(id))
        );
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}