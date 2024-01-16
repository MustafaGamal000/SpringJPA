package com.springboot.Springjpa.model.dto;

import com.springboot.Springjpa.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;
//    private Double salary;

    public static EmployeeDto toDto(Employee entity){
        return EmployeeDto.builder()
                .id(entity.getId())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
//                .salary(entity.getSalary())
                .build();
    }
}
