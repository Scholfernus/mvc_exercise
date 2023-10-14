package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @GetMapping("/win")
    public String getShop() {
        return "shop/windows";
    }
    @GetMapping("/dat")
    public String getDataTables(){
        return "shop/dataTables";
    }

}
