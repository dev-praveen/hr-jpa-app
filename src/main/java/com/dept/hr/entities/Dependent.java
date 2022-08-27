package com.dept.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dependents")
public class Dependent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "dependent_id", nullable = false)
  private Integer id;

  @Column(name = "first_name", nullable = false, length = 50)
  private String firstName;

  @Column(name = "last_name", nullable = false, length = 50)
  private String lastName;

  @Column(name = "relationship", nullable = false, length = 25)
  private String relationship;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "employee_id", nullable = false)
  private Employee employee;
}
