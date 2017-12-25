package com.xg.service;

import com.xg.entity.User;

public interface UserService {
    public User checkUserLogin(String name,String password);
}
