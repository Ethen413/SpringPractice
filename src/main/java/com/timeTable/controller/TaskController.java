package com.timeTable.controller;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.Task;
import com.timeTable.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping("/add")
    public String add(@RequestBody Task task)
    {
         taskService.add(task);
         return "ok";
    }
    @GetMapping("/list/{userId}")
    public PageInfo<Task> list(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize, @PathVariable Long userId)
    {
        return taskService.getByUserId(pageNum,pageSize,userId);
    }
    @PutMapping("/update")
    public String update(Task task)
    {
        taskService.update(task);
        return "ok";
    }
    @GetMapping("find")
    public Task findById(Long id)
    {
        return taskService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id)
    {
        taskService.delete(id);
        return "ok";
    }
}
