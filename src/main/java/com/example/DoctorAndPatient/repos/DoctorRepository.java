package com.example.DoctorAndPatient.repos;

import com.example.DoctorAndPatient.Entittes.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
