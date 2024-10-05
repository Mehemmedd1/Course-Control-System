package com.Mehemmed.CourseSystem.utils;


import com.Mehemmed.CourseSystem.Exception.BaseException;

public class CommonUtils {

    @FunctionalInterface
    public interface Checker {
        boolean check();
    }

    public static void throwIf(Checker checker, BaseException ex) {
        if (checker.check()) {
            throw ex;
        }
    }

}