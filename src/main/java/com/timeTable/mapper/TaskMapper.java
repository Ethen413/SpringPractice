package com.timeTable.mapper;

import com.timeTable.entity.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskMapper {
     Task findById(Long id);
     List<Task> findByUserId(Long id);
     int insert(Task task);
     int update(Task task);
     int delete(Long id);
}
