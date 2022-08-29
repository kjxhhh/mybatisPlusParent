package com.yr.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yr.entity.User;
import com.yr.mapper.UserMapper;
import com.yr.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements Userservice<User> {

    @Autowired
    private UserMapper userMapper;



    /**
     * 查询
     */
    @Override
    public IPage<User> getUsers(Integer Current) {

        IPage<User> iPage = new Page<User>(Current,3);

        IPage<User> users = userMapper.selectPage(iPage, null);
        return users;
    }

    /**
     * 添加
     */
    @Override
    public void addUser(User user) {
        userMapper.insert(user);

    }

    /**
     * 修改
     */
    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);

    }

    /**
     * 修改回显
     */
    @Override
    public User getUserById(Integer id) {

        User user = userMapper.selectById(id); // 查询一条数据也可以是修改的回显

        return user;
    }

    /**
     * 删除
     */
    @Override
    public void deleteUser(User user) {
        userMapper.deleteById(user);
    }
}
