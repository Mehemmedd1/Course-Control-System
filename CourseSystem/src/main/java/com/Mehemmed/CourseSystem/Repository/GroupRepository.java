package com.Mehemmed.CourseSystem.Repository;
import com.Mehemmed.CourseSystem.Model.Mybatis.group.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface GroupRepository {
    List<Group> findAll();
    Optional<Group>  findById(@Param("id") Long id);
    void insert(Group group);
    void update(Group group);
}