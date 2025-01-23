package com.springbootcourse.employeeTracker.service;


import com.springbootcourse.employeeTracker.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployeeById(int id);
}
