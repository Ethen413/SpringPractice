package com.timeTable.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.timeTable.entity.Task;
import com.timeTable.mapper.TaskMapper;
import com.timeTable.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;
    @Override
    public Task getById(Long id) {
        return taskMapper.findById(id);
    }

    @Override
    public PageInfo<Task> getByUserId(int pageNum,int pageSize,Long userId) {
        PageHelper.startPage(pageNum,pageSize);
        List<Task> list = taskMapper.findByUserId(userId);
        return new PageInfo<>(list);
    }

    @Override
    public void add(Task task) {
     taskMapper.insert(task);
    }

    @Override
    public void update(Task task) {
     taskMapper.update(task);
    }

    @Override
    public void delete(Long id) {
       taskMapper.delete(id);
    }
}
