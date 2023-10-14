package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutMeController {
    @GetMapping("/me")
    public String getAboutMe(){
        return "aboutMe";
    }
}
