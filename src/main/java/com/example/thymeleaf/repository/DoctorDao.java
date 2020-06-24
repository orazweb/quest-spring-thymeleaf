package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.Doctor;

import java.util.List;

public interface DoctorDao {
    //TODO
    Doctor findByNumber(int number);

    List<Doctor> findAll();

}
