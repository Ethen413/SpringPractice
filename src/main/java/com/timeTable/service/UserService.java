package com.timeTable.service;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    PageInfo<User> find(int pageNum,int pageSize,User user);
    void delete(Long id);
}
