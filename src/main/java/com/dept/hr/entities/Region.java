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
@Table(name = "regions")
public class Region {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "region_id", nullable = false)
  private Integer id;

  @Column(name = "region_name", length = 25)
  private String regionName;
}
