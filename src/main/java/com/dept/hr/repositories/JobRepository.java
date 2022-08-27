package com.dept.hr.repositories;

import com.dept.hr.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {}
