package com.dept.hr.controllers;

import com.dept.hr.entities.Employee;
import com.dept.hr.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee-resource")
public class EmployeeResource {

  private final EmployeeService employeeService;

  @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Employee> fetchAllEmployees() {

    return employeeService.getAllEmployees();
  }

  @PostMapping(
      value = "/add-employee",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Employee addNewEmployee(@RequestBody Employee employee) {

    return employeeService.saveEmployee(employee);
  }

  @GetMapping(value = "/employees/{first-name}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Employee getEmployee(@PathVariable(name = "first-name") String firstName) {

    return employeeService.getEmployeeByFirstName(firstName);
  }

  @DeleteMapping(value = "/remove/{employee-id}")
  public void removeEmployee(@PathVariable(name = "employee-id") Integer employeeId) {

    employeeService.deleteEmployee(employeeId);
  }
}
