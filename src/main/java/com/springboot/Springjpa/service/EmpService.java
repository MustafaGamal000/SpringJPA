package com.springboot.Springjpa.service;

import com.springboot.Springjpa.model.dto.EmployeeDto;
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

    public EmployeeDto getUserById(int id){
        Optional<Employee> emp = this.repo.findById(id);
        return emp.map(EmployeeDto::toDto).orElse(null);
    }

    public EmployeeDto save(EmployeeDto emp) {
        return EmployeeDto.toDto(repo.save(Employee.toEntity(emp)));
    }

    public void deleteEmp(int id) {
        repo.deleteById(id);
    }

    public EmployeeDto updateEmp(EmployeeDto emp) {
        return EmployeeDto.toDto(repo.save(Employee.toEntity(emp)));
    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }
}
