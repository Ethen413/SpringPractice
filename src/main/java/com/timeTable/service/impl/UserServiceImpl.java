package com.timeTable.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.timeTable.entity.User;
import com.timeTable.mapper.UserMapper;
import com.timeTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public PageInfo<User> find(int pageNum,int pageSize,User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.findByUser(user);
        return new PageInfo<>(list);
    }

    @Override
    public void delete(Long id) {
          userMapper.delete(id);
    }
}
