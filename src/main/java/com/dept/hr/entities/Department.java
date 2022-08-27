package com.dept.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "department_id", nullable = false)
  private Integer id;

  @Column(name = "department_name", nullable = false, length = 30)
  private String departmentName;
}
