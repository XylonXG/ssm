package com.xg.serviceImpl;

import com.xg.entity.User;
import com.xg.mapper.UserMapper;
import com.xg.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User checkUserLogin(String name, String password) {
        User user=userMapper.userLogin(name);
        if(user!=null&&user.getName().equals(name)&&user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
