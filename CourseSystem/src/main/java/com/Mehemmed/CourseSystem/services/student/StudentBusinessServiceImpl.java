package com.Mehemmed.CourseSystem.services.student;

import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.role.Role;
import com.Mehemmed.CourseSystem.Model.Mybatis.student.Student;
import com.Mehemmed.CourseSystem.Model.Mybatis.user.User;
import com.Mehemmed.CourseSystem.Model.mappers.UserEntityMapper;
import com.Mehemmed.CourseSystem.Model.payload.student.StudentPayload;
import com.Mehemmed.CourseSystem.services.group.GroupService;
import com.Mehemmed.CourseSystem.services.role.RoleService;
import com.Mehemmed.CourseSystem.services.user.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.Mehemmed.CourseSystem.Model.enums.response.ErrorResponseMessages.PHONE_NUMBER_ALREADY_EXIST;
import static com.Mehemmed.CourseSystem.Model.enums.response.ErrorResponseMessages.STUDENT_ALREADY_ADDED_TO_GROUP;
import static com.Mehemmed.CourseSystem.utils.CommonUtils.throwIf;


@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentBusinessServiceImpl implements StudentBusinessService {
    final UserService userService;
    final StudentService studentService;
    final GroupService groupService;
    final RoleService roleService;
    final BCryptPasswordEncoder passwordEncoder;
    static final String PASSWORD = "123456789";


    //todo:Assign process for groups
    @Override
    public void addStudent(StudentPayload studentPayload) {

        throwIf(() -> userService.checkByPhoneNumber(studentPayload.getPhoneNumber()), BaseException.of(PHONE_NUMBER_ALREADY_EXIST));

        //todo: we will change ROLE
        Role defaultRole = roleService.getDefaultRole();

        User user = UserEntityMapper.INSTANCE.fromStudentPayloadToUser(
                studentPayload,
                //todo: we will change PASSWORD
                passwordEncoder.encode(PASSWORD),
                defaultRole.getId()
        );

        userService.insert(user);

        studentService.insert(Student.builder().userId(user.getId()).build());

    }

    @Override
    public void addStudentToGroup(long studentId, long groupId) {

        studentService.findById(studentId);
        groupService.findById(groupId);

        throwIf(() -> studentService.checkStudentAlreadyAddedToGroup(studentId), BaseException.of(STUDENT_ALREADY_ADDED_TO_GROUP));

        studentService.addStudentToGroup(studentId, groupId);
    }

}