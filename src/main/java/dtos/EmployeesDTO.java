/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Employees;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ckfol
 */
public class EmployeesDTO {
    private List<EmployeeDTO> employeeDTOs = new ArrayList<>();

    public EmployeesDTO(List<Employees> e) {
        
        e.forEach((eDTO) -> {
            employeeDTOs.add(new EmployeeDTO(eDTO));
        });
    }

    public List<EmployeeDTO> getEmployeeDTOs() {
        return employeeDTOs;
    }
    
}
