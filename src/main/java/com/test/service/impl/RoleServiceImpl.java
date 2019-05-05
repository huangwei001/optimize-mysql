package com.test.service.impl;

import com.test.entity.Role;
import com.test.mapper.RoleMapper;
import com.test.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public void saveRole(Role role) {
        role.setId(UUID.randomUUID().toString());
        roleMapper.insert(role);
    }
}
