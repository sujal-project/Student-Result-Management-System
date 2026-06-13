package com.srms.controller;

import com.srms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "dashboard"; // Serves dashboard.html template
    }
}