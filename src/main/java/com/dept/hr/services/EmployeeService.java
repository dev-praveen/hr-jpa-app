package com.dept.hr.services;

import com.dept.hr.entities.Employee;
import com.dept.hr.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  public List<Employee> getAllEmployees() {

    return employeeRepository.findAll();
  }

  public Employee saveEmployee(Employee employee) {

    return employeeRepository.save(employee);
  }

  public Employee getEmployeeByFirstName(String firstName) {

    return employeeRepository.findByFirstName(firstName);
  }

  public void deleteEmployee(Integer id) {

    employeeRepository.deleteById(id);
  }
}
