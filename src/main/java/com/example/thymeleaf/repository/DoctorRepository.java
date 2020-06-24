package com.example.thymeleaf.repository;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO

@Repository
public class DoctorRepository implements DoctorDao {

    private static List<Doctor> doctors = new ArrayList<>(
            Arrays.asList(
                    new Doctor(1,"William Hartnell"),
                    new Doctor(2,"Patrick Troughton"),
                    new Doctor(3,"Jon Pertwee"),
                    new Doctor(4,"Tom Baker"),
                    new Doctor(5,"Peter Davison"),
                    new Doctor(6,"Colin Baker"),
                    new Doctor(7,"Sylvester McCoy"),
                    new Doctor(8,"Paul McGann"),
                    new Doctor(9,"Christopher Eccleston"),
                    new Doctor(10,"David Tennant"),
                    new Doctor(11,"Matt Smith"),
                    new Doctor(12,"Peter Capaldi"),
                    new Doctor(13,"Jodie Whittaker")
            )
    );

    @Override
    public Doctor findByNumber(int number) {
        for (Doctor doctor : doctors) {
            if (doctor.getNumber() == number) return doctor;
        }
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        return doctors;
    }
}
