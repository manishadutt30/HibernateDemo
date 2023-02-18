package com.example.DoctorAndPatient.repos;

import com.example.DoctorAndPatient.Entittes.Doctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorRepositoryTest {

    @Autowired
    DoctorRepository doctorRepository;

    @Test
    public void createtestData(){
        Doctor doctor = new Doctor();
        doctor.setFirstName("John");
        doctor.setLastName("ABC");
        doctor.setSpeciality("ALL");

        doctorRepository.save(doctor);
    }
}
