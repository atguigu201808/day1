package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {

    /**
     * 按照id查询
     * @param id
     * @return
     */
    public User queryByid(Long id);

    /**
     * 查询所有
     * @return
     */
    public List<User> queryAll();


    /**
     * username查询
     * @param username
     * @return
     */
    public User queryByName(String username);


    /**
     * id删除
     * @param id
     */
    public void deleteById(Long id);

    /**
     * 添加
     * @param user
     */
    public void addUser(User user);

    /**
     * 更改
     * @param
     */
    public void updateUser(User user);
}
