package com.Mehemmed.CourseSystem.services.course;
import com.Mehemmed.CourseSystem.Model.Mybatis.course.Course;
import com.Mehemmed.CourseSystem.Repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public void insert(Course course) {
        courseRepository.insert(course);
    }
}