package com.nikoay.lil.adminweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String getLogin()
    {
        return "login";
    }
}
