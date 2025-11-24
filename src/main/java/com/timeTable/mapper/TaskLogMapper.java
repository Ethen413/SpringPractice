package com.timeTable.mapper;

import com.github.pagehelper.PageInfo;

import com.timeTable.entity.TaskLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskLogMapper {
    List<TaskLog> list(TaskLog taskLog);
    int delete(Long id);
    int update(TaskLog taskLog);
    int insert(TaskLog taskLog);
}
