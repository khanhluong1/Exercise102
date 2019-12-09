package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("MyMess", "My name is ");
        model.addAttribute("Name", "Derek");
        return "index";
    }
}
