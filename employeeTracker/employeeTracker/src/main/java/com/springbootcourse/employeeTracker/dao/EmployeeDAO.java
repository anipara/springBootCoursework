package com.springbootcourse.employeeTracker.dao;


import com.springbootcourse.employeeTracker.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(int id);
}
