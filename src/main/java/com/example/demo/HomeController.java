package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "hope your day is going well");
        model.addAttribute("mysecondvar", "mine is fantastic!");
                return "hometemplate";
    }
}
