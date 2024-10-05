package com.Mehemmed.CourseSystem.Repository;
import com.Mehemmed.CourseSystem.Model.Mybatis.role.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface RoleRepository {

    Optional<Role> findByName(@Param("name") String name);

}