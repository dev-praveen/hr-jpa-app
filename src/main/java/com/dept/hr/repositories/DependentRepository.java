package com.dept.hr.repositories;

import com.dept.hr.entities.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepository extends JpaRepository<Dependent, Integer> {}
