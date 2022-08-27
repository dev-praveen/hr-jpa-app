package com.dept.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "employee_id", nullable = false)
  private Integer id;

  @Column(name = "first_name", length = 20)
  private String firstName;

  @Column(name = "last_name", nullable = false, length = 25)
  private String lastName;

  @Column(name = "email", nullable = false, length = 100)
  private String email;

  @Column(name = "phone_number", length = 20)
  private String phoneNumber;

  @Column(name = "hire_date", nullable = false)
  private LocalDate hireDate;

  @ManyToOne(fetch = FetchType.EAGER, optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "job_id", nullable = false)
  private Job job;

  @Column(name = "salary", nullable = false, precision = 8, scale = 2)
  private BigDecimal salary;

  @ManyToOne(fetch = FetchType.EAGER)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "manager_id")
  private Employee manager;
}
