package com.timeTable.service;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);
    PageInfo<Task> getByUserId(int pageNum,int pageSize,Long userId);
    void add(Task task);
    void update(Task task);
    void delete(Long id);
}
