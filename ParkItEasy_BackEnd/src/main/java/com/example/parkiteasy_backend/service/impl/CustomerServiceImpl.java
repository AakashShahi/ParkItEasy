package com.example.parkiteasy_backend.service.impl;

import com.example.parkiteasy_backend.entity.Customer;
import com.example.parkiteasy_backend.pojo.CustomerPojo;
import com.example.parkiteasy_backend.repository.AddressRepository;
import com.example.parkiteasy_backend.repository.CustomerRepository;
import com.example.parkiteasy_backend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(CustomerPojo customerPojo) {
        Customer customer = new Customer();
        customer.setId(customerPojo.getId());
        customer.setEmail(customerPojo.getEmail());
        customer.setFullName(customerPojo.getFullName());
        customer.setPhoneNumber(customerPojo.getPhoneNo());
        customer.setPassword(customerPojo.getPassword());
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Long id, CustomerPojo customerPojo) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            customer.get().setId(customerPojo.getId());
            customer.get().setFullName(customerPojo.getFullName());
            customer.get().setEmail(customerPojo.getEmail());
            customer.get().setPhoneNumber(customerPojo.getPhoneNo());
            customer.get().setPassword(customerPojo.getPassword());
            return customerRepository.save(customer.get());
        }else{
            return null;
        }
    }

    @Override
    public Customer getCustomerById(Long id) {
       return customerRepository.findById(id).orElse(null);
    }
}
