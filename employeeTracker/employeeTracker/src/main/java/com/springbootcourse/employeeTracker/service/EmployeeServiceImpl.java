package com.springbootcourse.employeeTracker.service;

import com.springbootcourse.employeeTracker.dao.EmployeeDAOImpl;
import com.springbootcourse.employeeTracker.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAOImpl employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAOImpl employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDAO.getEmployees();
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee){
        return employeeDAO.saveEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int id){
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id){
        employeeDAO.deleteEmployee(id);
    }
}
