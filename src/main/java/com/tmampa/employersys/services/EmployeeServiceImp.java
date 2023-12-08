package com.tmampa.employersys.services;

import com.tmampa.employersys.models.Employee;
import com.tmampa.employersys.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        Optional<Employee> optionalEmployee = employeeRepo.findById(id);
        Employee employee;
        if (optionalEmployee.isPresent()) {
            employee = optionalEmployee.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        Employee employeeFromDB = employeeRepo.findById(id).get();
        employeeFromDB.setFullName(employee.getFullName());
        employeeFromDB.setSalary(employee.getSalary());
        employeeFromDB.setEmail(employee.getEmail());
        employeeFromDB.setImage(employee.getImage());
        employeeFromDB.setDepartment(employee.getDepartment());
        employeeFromDB.setPosition(employee.getPosition());

        employeeRepo.save(employeeFromDB);
        return employeeFromDB;
    }

    @Override
    public void deleteEmployeeById(String id) {

    }
}
