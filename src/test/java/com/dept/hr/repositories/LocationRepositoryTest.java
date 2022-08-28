package com.dept.hr.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles(value = "test")
class LocationRepositoryTest {

  @Autowired LocationRepository locationRepository;

  @Test
  void shouldFetchAllLocations() {

    final var locations = locationRepository.findAll();
    assertNotNull(locations);
    System.out.println(locations);
  }
}
