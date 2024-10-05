package com.Mehemmed.CourseSystem.services.base;

public interface TokenGenerator <T> {

    String generate(T obj);

}