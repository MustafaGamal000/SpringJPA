package com.springboot.Springjpa.model.entity;

import com.springboot.Springjpa.model.dto.EmployeeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Employee")
@jakarta.persistence.Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    private Double salary;

    public static Employee toEntity(EmployeeDto emp){
        return Employee.builder()
                .id(emp.getId())
                .firstname(emp.getFirstname())
                .lastname(emp.getLastname())
                .build();
    }
}
