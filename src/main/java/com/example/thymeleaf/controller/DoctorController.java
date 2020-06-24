package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import com.example.thymeleaf.repository.DoctorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @Autowired
    private DoctorDao repository;

    @GetMapping("/doctor")
    public String doctor(Model model,
                         @RequestParam(required = false, defaultValue = "0") int number,
                         @RequestParam(required = false, defaultValue = "John Smith") String name) {
        Doctor doctor = new Doctor();
        if (number != 0) {
            doctor = repository.findByNumber(number);
        }
        model.addAttribute("doctor", doctor);

        return "doctor";
    }

    @GetMapping("/")
    public String getAll(Model model) {

        model.addAttribute("doctors", repository.findAll());

        return "index";
    }

}
