package com.dept.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobs")
public class Job {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "job_id", nullable = false)
  private Integer id;

  @Column(name = "job_title", nullable = false, length = 35)
  private String jobTitle;

  @Column(name = "min_salary", precision = 8, scale = 2)
  private BigDecimal minSalary;

  @Column(name = "max_salary", precision = 8, scale = 2)
  private BigDecimal maxSalary;
}
