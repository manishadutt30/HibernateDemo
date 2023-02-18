package com.example.DoctorAndPatient.repos;


import com.example.DoctorAndPatient.Entittes.Doctor;
import com.example.DoctorAndPatient.Entittes.Insurance;
import com.example.DoctorAndPatient.Entittes.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Test
    public void createtestData(){
        Patient patient = new Patient();
        patient.setFirstName("Manisha");
        patient.setLastName("Dutt");
        patient.setPhone("12345678");
        Insurance insurance = new Insurance();
        insurance.setProviderName("Blue cross");
        insurance.setCopay(20d);
        patient.setInsurance(insurance);

        Doctor doctor = doctorRepository.findById(1L).orElse(null);
        List<Doctor> doctorList = Arrays.asList(doctor);
        //List<Doctor> doctorList = Collections.singletonList(doctor);
        patient.setDoctors(doctorList);
        patientRepository.save(patient);

    }
}
