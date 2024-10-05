package com.Mehemmed.CourseSystem.Repository;

import com.Mehemmed.CourseSystem.Model.Mybatis.branch.Branch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BranchRepository {

    void insert(Branch branch);

}