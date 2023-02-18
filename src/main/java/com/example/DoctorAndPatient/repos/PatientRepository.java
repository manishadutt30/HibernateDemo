package com.example.DoctorAndPatient.repos;

import com.example.DoctorAndPatient.Entittes.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
