package com.srms.controller;

import com.srms.model.Student;
import com.srms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ResultController {

    @Autowired
    private StudentRepository studentRepository;

    // 1. Serves the dashboard page with existing student data
    @GetMapping("/dashboard")
    public String viewDashboard(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("newStudent", new Student()); // Empty object for the form
        return "dashboard";
    }

    // 2. Receives form submissions from the browser and saves them to MySQL
    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("newStudent") Student student) {
        studentRepository.save(student); // Saves the record to your MySQL database
        return "redirect:/dashboard";   // Reloads the dashboard to display updates
    }
}