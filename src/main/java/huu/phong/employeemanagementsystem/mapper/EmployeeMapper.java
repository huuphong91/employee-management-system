package huu.phong.employeemanagementsystem.mapper;

import huu.phong.employeemanagementsystem.dto.EmployeeDto;
import huu.phong.employeemanagementsystem.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }

    public static Employee toEntity(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
    }
}
