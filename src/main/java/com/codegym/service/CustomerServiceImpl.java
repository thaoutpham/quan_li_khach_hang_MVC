package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Thao", "thao123", "Nam Dinh"));
        customers.put(2, new Customer(2, "Thao", "thao123", "Nam Dinh"));
        customers.put(3, new Customer(3, "Thao", "thao123", "Nam Dinh"));
        customers.put(4, new Customer(4, "Thao", "thao123", "Nam Dinh"));
        customers.put(5, new Customer(5, "Thao", "thao123", "Nam Dinh"));
        customers.put(6, new Customer(6, "Thao", "thao123", "Nam Dinh"));
        customers.put(7, new Customer(7, "Thao", "thao123", "Nam Dinh"));
        customers.put(8, new Customer(8, "Thao", "thao123", "Nam Dinh"));
        customers.put(9, new Customer(9, "Thao", "thao123", "Nam Dinh"));
        customers.put(10, new Customer(10, "Thao", "thao123", "Nam Dinh"));
        customers.put(11, new Customer(11, "Thao", "thao123", "Nam Dinh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
