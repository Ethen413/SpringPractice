package com.timeTable.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.timeTable.entity.TaskLog;
import com.timeTable.mapper.TaskLogMapper;
import com.timeTable.service.TaskLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskLogServiceImpl implements TaskLogService {
    @Autowired
    TaskLogMapper taskLogMapper;
    @Override
    public PageInfo<TaskLog> list(int pageNum, int pagesize, TaskLog taskLog) {
        PageHelper.startPage(pageNum,pagesize);
        List<TaskLog> list = taskLogMapper.list(taskLog);
        return new PageInfo<>(list);
    }

    @Override
    public void add(TaskLog taskLog) {
      taskLogMapper.insert(taskLog);
    }

    @Override
    public void delete(Long id) {
     taskLogMapper.delete(id);
    }

    @Override
    public void update(TaskLog taskLog) {
    taskLogMapper.update(taskLog);
    }
}
