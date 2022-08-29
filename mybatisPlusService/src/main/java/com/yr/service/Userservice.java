package com.yr.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface Userservice<T> extends IService<User> {

    @Autowired
    public User user = null;

    public IPage<T> getUsers(Integer Current);


    // 添加数据
    public void addUser(T t);

    // 修改数据 updateUser
    public void updateUser(T t);

    // 修改回显数据 getUserById
    public User getUserById(Integer id);

    // 删除数据 deleteUser
    public void deleteUser(T t);

}
