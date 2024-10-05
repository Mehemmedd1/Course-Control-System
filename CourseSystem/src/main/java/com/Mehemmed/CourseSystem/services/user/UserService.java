package com.Mehemmed.CourseSystem.services.user;


import com.Mehemmed.CourseSystem.Model.Mybatis.user.User;

public interface UserService {

    void insert(User user);

    void update(User user);

    User getByEmail(String email);

    User getById(Long id);

    boolean checkByEmail(String email);

    boolean checkByPhoneNumber(String phoneNumber);
}