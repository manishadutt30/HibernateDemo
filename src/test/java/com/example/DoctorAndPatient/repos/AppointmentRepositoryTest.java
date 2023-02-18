package com.example.DoctorAndPatient.repos;

import com.example.DoctorAndPatient.Entittes.Appointment;
import com.example.DoctorAndPatient.Entittes.Doctor;
import com.example.DoctorAndPatient.Entittes.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.print.Doc;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentRepositoryTest {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Test
    public void createtestData(){

        Timestamp time = new Timestamp(new Date().getTime());
        Appointment appointment = new Appointment();
        appointment.setTime(time);
        appointment.setReason("allergy");
        appointment.setStart(true);

        Patient patient = patientRepository.findById(2L).orElse(null);
        Doctor doctor = doctorRepository.findById(1L).orElse(null);
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);
    }
}
