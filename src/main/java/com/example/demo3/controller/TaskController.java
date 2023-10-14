package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping("/addTask")
    public String getAddTasks(){
        return "tasks/addTask";
    }
    @GetMapping("/tasks")
    public String getTasksList(){
        return "tasks/tasks";
    }
}
