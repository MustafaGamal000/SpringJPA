package com.springboot.Springjpa.controller;

import com.springboot.Springjpa.model.dto.EmployeeDto;
import com.springboot.Springjpa.model.entity.Employee;
import com.springboot.Springjpa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public EmployeeDto getEmp(@RequestParam int id){
        return empService.getUserById(id);
    }

    @PostMapping("/add-emp")
    public EmployeeDto addEmp(@RequestBody EmployeeDto emp){
        return empService.save(emp);
    }

    @PostMapping("/update-emp")
    public EmployeeDto updateEmp(@RequestBody EmployeeDto emp){
        return empService.updateEmp(emp);
    }

    @PostMapping("/delete-emp")
    public void deleteEmp(@RequestParam int id){
        empService.deleteEmp(id);
    }

    @GetMapping("/get-all")
    public List<Employee> getAllEmp(){
        return empService.getAllEmp();
    }
}
