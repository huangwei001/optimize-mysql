package com.test.mapper;

import com.test.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
