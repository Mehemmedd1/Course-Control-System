package com.Mehemmed.CourseSystem.services.base;

public interface TokenReader <T> {

    T read(String token);

}