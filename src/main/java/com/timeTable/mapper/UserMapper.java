package com.timeTable.mapper;

import com.timeTable.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findByUser(User user);
    int insert(User user);
    int delete(Long id);
    int update(User user);
}
