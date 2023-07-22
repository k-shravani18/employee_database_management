package org.management.employee_database_management.service;

import org.management.employee_database_management.model.Employee;
import org.management.employee_database_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employeeInfo) {
        employeeRepository.save(employeeInfo);
    }

    public Employee get(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    public void delete(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
