package com.atguigu.service;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    public User queryByid(Long id);

    public List<User> queryAll();

    public User queryByName(String username);

    public void deleteById(Long id);


    public void addUser(User user);

    public void updateUser(User user);
}
