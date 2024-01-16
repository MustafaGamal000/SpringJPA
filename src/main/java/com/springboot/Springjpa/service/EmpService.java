package com.springboot.Springjpa.service;

import com.springboot.Springjpa.model.entity.Employee;
import com.springboot.Springjpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repo ;

    public Employee getUserById(int id){
        Optional<Employee> emp = this.repo.findById(id);
        return emp.orElse(new Employee());
    }
}