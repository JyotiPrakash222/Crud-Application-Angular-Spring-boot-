package com.example.crudapp.service;


import org.springframework.stereotype.Service;

import com.example.crudapp.entity.Customer;
import com.example.crudapp.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    public Customer postCustomer(Customer customer){
        return customerRepository.save(customer);
    }
}
