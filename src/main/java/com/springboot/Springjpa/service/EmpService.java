package com.springboot.Springjpa.service;

import com.springboot.Springjpa.model.entity.Employee;
import com.springboot.Springjpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repo ;

    public Employee getUserById(int id){
        Optional<Employee> emp = this.repo.findById(id);
        return emp.orElse(new Employee());
    }

    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    public void deleteEmp(int id) {
        repo.deleteById(id);
    }

    public Employee updateEmp(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }
}
