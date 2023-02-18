package com.example.DoctorAndPatient.Composite;

import com.example.DoctorAndPatient.Composite.Entitties.Customer;
import com.example.DoctorAndPatient.Composite.Repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerrepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testcreateData(){

        Customer customer = new Customer();
        customer.setId(1);
        customer.setEmail("test@gmail.com");
        customer.setName("Test");

        customerRepository.save(customer);
    }
}
