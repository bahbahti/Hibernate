package com.netcracker.service;

import com.netcracker.dao.CustomerDAO;
import com.netcracker.dao.CustomerIDAOImpl;
import com.netcracker.dao.IDAO;
import com.netcracker.model.Customer;
import com.netcracker.service.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("customerService")
public class CustomerService implements ICustomerService {

    @Autowired
    @Qualifier("customerDao")
    IDAO IDAO;

    @Autowired
    CustomerDAO customerDAO;


    @Override
    public void add(Customer entity) {
        IDAO.add(entity);
    }

    @Override
    public List<Customer> findAll() {
        return IDAO.findAll();
    }

    @Override
    public Customer findById(int id) {
        return (Customer) IDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        IDAO.deleteById(id);
    }

    @Override
    public void updateById(int id, Customer entity) {
        IDAO.updateById(id, entity);
    }

    @Override
    public int getRowCount() {
        return IDAO.getRowCount();
    }

    public void showAreas() {
        List<Customer> customers = findAll();
        Set<String> set = new HashSet<>();
        for(Customer customer : customers) {
            set.add(customer.getArea());
        }
        System.out.println("Different areas: ");
        System.out.println(set.toString());
        System.out.println();
    }

    @Override
    public void showLastNameAndSale() {
        customerDAO.showLastNameAndSale();
    }
}
