package com.clientui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ClientController {
    @RequestMapping("/")
    public String home(Model model) {
        DateFormat dateFormat = new SimpleDateFormat();
        model.addAttribute("serverTime", dateFormat.format(new Date()));
        return "Home";
    }
}
