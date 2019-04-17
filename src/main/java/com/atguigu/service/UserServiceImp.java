package com.atguigu.service;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByid(Long id) {

        return this.userMapper.queryByid(id);
    }

    @Override
    public List<User> queryAll() {
        return this.userMapper.queryAll();

    }

    @Override
    public User queryByName(String username) {
        return this.userMapper.queryByName(username);
    }

    @Override
    public void deleteById(Long id) {
        this.userMapper.deleteById(id);
    }

    @Override
    public void addUser(User user) {
        this.userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {

        this.userMapper.updateUser(user);
    }
}
