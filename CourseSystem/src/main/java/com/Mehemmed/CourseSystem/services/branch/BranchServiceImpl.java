package com.Mehemmed.CourseSystem.services.branch;


import com.Mehemmed.CourseSystem.Model.Mybatis.branch.Branch;
import com.Mehemmed.CourseSystem.Repository.BranchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    @Override
    public void insert(Branch branch) {
        branchRepository.insert(branch);
    }
}