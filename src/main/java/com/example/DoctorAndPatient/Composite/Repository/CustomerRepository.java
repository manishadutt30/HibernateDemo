package com.example.DoctorAndPatient.Composite.Repository;

import com.example.DoctorAndPatient.Composite.Entitties.Customer;
import com.example.DoctorAndPatient.Composite.Entitties.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
