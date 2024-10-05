package com.Mehemmed.CourseSystem.services.group;


import com.Mehemmed.CourseSystem.Model.Mybatis.group.Group;

import java.util.List;

public interface GroupService {

    List<Group> findAll();
    Group findById(Long id);
    void insert(Group group);
    void  update(Group group);
}