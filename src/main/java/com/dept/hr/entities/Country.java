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
@Table(name = "countries")
public class Country {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "country_id", nullable = false, length = 2)
  private String id;

  @Column(name = "country_name", length = 40)
  private String countryName;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "region_id", nullable = false)
  private Region region;
}
