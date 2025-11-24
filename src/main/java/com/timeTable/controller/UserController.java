package com.timeTable.controller;

import com.github.pagehelper.PageInfo;
import com.timeTable.entity.User;
import com.timeTable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/find")
    public PageInfo<User> getUser(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,@RequestBody User user)
    {
        return userService.find(pageNum,pageSize,user);
    }
    @PostMapping("/add")
    public String add(User user)
    {
        userService.add(user);
        return "ok";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id)
    {
        userService.delete(id);
        return "ok";
    }
    @PutMapping("/update")
    public String update(User user)
    {
        userService.update(user);
        return "ok";

    }
}
