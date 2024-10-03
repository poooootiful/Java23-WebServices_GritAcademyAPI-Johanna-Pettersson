package com.javaswebservice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping({"/home"})
public class Homecontroller {

    @GetMapping
    public String home (@RequestParam(value = "name", defaultValue = "home", required = true)String name, Model model){
        model.addAttribute("name", name);
        return "homepage";
    }
}
