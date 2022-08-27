package com.dept.hr.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeRepositoryTest {

  @Autowired EmployeeRepository employeeRepository;

  @Test
  void shouldFetchAllEmployees() {

    final var employees = employeeRepository.findAll();
    assertNotNull(employees);
    System.out.println(employees);
  }
}
