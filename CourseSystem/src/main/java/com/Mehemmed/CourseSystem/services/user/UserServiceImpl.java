package com.Mehemmed.CourseSystem.services.user;


import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.user.User;
import com.Mehemmed.CourseSystem.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void insert(User user) {
        userRepository.insert(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> BaseException.notFound(User.class.getSimpleName(), "email", email)
        );
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> BaseException.notFound(User.class.getSimpleName(), "id", id)
        );
    }

    @Override
    public boolean checkByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    @Override
    public boolean checkByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber).isPresent();
    }
}