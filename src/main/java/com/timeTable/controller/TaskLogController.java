package com.timeTable.controller;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.TaskLog;
import com.timeTable.service.TaskLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskLog")
public class TaskLogController {
    @Autowired
    TaskLogService taskLogService;
    @GetMapping("/list")
    public PageInfo<TaskLog> list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestBody TaskLog taskLog)
    {
        return taskLogService.list(pageNum,pageSize,taskLog);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        taskLogService.delete(id);
        return "ok";
    }
    @PostMapping("/add")
    public String add(@RequestBody TaskLog taskLog)
    {
        taskLogService.add(taskLog);
        return "ok";
    }
    @PutMapping("/update")
    public String update(@RequestBody TaskLog taskLog) {
        taskLogService.update(taskLog);
        return "ok";
    }

}
