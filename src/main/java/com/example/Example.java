package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Example {

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }
    
    @RequestMapping("/page")
    public String page() {
        return "page";
    }

}