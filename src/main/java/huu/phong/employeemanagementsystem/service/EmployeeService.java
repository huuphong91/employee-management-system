package huu.phong.employeemanagementsystem.service;

import huu.phong.employeemanagementsystem.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> findAll();
    EmployeeDto findById(Long id);
    EmployeeDto save(EmployeeDto employeeDto);
    EmployeeDto update(Long id, EmployeeDto employeeDto);
    void delete(Long id);
}
