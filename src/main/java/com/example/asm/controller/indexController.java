package com.example.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index(Model model) {
        return "user/pages/home";
    }

    @RequestMapping("/products")
    public String products(Model model){
        return "user/pages/products";
    }

    @RequestMapping("/about")
    public String about(Model model){
        return "user/pages/about";
    }

    @RequestMapping("/contact")
    public String contact(Model model){
        return "user/pages/contact";
    }

    @RequestMapping("/detail")
    public String detail(Model model){
        return "user/pages/detail";
    }
}