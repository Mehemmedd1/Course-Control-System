package com.Mehemmed.CourseSystem.services.employee;

import com.Mehemmed.CourseSystem.Model.Mybatis.employee.Employee;
import com.Mehemmed.CourseSystem.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public void insert(Employee employee) {
        employeeRepository.insert(employee);
    }
}