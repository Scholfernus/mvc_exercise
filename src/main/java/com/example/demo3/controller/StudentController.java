package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/add")
    public String addStudent(){
        return "students/addNewPerson";
    }
    @GetMapping("/edit")
    public String editStudent(){
        return "students/editPerson";
    }
    @GetMapping("/list")
    public String getStudentsList(){
        return "students/personList";
    }

}
