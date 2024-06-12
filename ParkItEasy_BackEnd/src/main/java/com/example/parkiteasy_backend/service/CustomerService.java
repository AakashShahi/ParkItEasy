package com.example.parkiteasy_backend.service;

import com.example.parkiteasy_backend.entity.Customer;
import com.example.parkiteasy_backend.pojo.CustomerPojo;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(CustomerPojo customerPojo);
    List<Customer> getAllCustomers();
    void deleteCustomerById(Long id);
    Customer updateCustomer(Long id, CustomerPojo customerPojo);
    Customer getCustomerById(Long id);
}
