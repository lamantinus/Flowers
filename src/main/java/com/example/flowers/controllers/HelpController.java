package com.example.flowers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {

    @GetMapping("/help/shipping")
    public String shipping() {
        return "shipping";
    }

}
