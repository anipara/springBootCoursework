package com.springcourse.thymeleafdemo.controller;

import com.springcourse.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    List<String> countries;

    @Value("${languages}")
    List<String> languages;

    @Value("${systems}")
    List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model model){

        model.addAttribute("student", new Student());

        model.addAttribute("countries", countries);

        model.addAttribute("languages", languages);

        model.addAttribute("systems", systems);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student student ){
        return "student-confirmation";
    }
}
