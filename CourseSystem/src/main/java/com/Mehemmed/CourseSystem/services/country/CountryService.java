package com.Mehemmed.CourseSystem.services.country;

import com.Mehemmed.CourseSystem.Model.Mybatis.country.Country;

import java.util.List;

public interface CountryService {

    void insert(Country country);
    Country findById(long id);

    List<Country> findAll();

    void update(Country country);
}