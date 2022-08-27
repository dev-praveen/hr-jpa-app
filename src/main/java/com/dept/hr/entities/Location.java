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
@Table(name = "locations")
public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "location_id", nullable = false)
  private Integer id;

  @Column(name = "street_address", length = 40)
  private String streetAddress;

  @Column(name = "postal_code", length = 12)
  private String postalCode;

  @Column(name = "city", nullable = false, length = 30)
  private String city;

  @Column(name = "state_province", length = 25)
  private String stateProvince;
}
