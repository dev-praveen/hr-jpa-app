package com.dept.hr.repositories;

import com.dept.hr.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  Employee findByFirstName(String firstName);
}
