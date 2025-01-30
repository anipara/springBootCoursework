package com.springcourse.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/show")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @PostMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    /*
    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){

        String name = request.getParameter("studentName");

        String result = "YO " +  name.toUpperCase();

        model.addAttribute("message", result);

        return "helloworld";

    }
    */

    @RequestMapping("/processFormVersionThree")
    // Directly bind the param coming from the form to the parameter
    public String letsShoutWithBinding(@RequestParam("studentName") String name, Model model){

        String result = "Were binding this time " +  name.toUpperCase();

        model.addAttribute("message", result);

        return "helloworld";

    }
}
