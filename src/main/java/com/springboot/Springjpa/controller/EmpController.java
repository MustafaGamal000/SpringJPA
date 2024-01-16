package com.springboot.Springjpa.controller;

import com.springboot.Springjpa.model.entity.Employee;
import com.springboot.Springjpa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/get-emp")
    public Employee getEmp(@RequestParam int id){
        return empService.getUserById(id);
    }

    @PostMapping("/add-emp")
    public Employee addEmp(Employee emp){
        return empService.save(emp);
    }
}
