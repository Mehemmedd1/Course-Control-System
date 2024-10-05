package com.Mehemmed.CourseSystem.services.role;


import com.Mehemmed.CourseSystem.Exception.BaseException;
import com.Mehemmed.CourseSystem.Model.Mybatis.role.Role;
import com.Mehemmed.CourseSystem.Repository.RoleRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleServiceImpl implements RoleService{

    final static String OWNER = "OWNER";
    final RoleRepository roleRepository;

    @Override
    public Role getDefaultRole() {
        return roleRepository.findByName(OWNER).orElseThrow(BaseException::unexpected);
    }
}