package com.timeTable.service;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.TaskLog;

public interface TaskLogService {
    PageInfo<TaskLog> list(int pageNum,int pagesize,TaskLog taskLog);
    void add(TaskLog taskLog);
    void delete(Long id);
    void update(TaskLog taskLog);
}
