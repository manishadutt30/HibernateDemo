package com.example.DoctorAndPatient.repos;

import com.example.DoctorAndPatient.Entittes.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
