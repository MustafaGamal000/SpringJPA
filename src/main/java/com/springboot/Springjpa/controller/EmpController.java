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
}