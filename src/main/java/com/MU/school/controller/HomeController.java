package com.MU.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
        @GetMapping(value = {"","/","/home"})
    public String displayHomePage(Model model){

            model.addAttribute("username","Mohammad fqwerasdfAl-Najjar");
            return "home.html";
    }
}
