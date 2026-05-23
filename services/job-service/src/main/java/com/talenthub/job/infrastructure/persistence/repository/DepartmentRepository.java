package com.talenthub.job.infrastructure.persistence.repository;

import com.talenthub.job.domain.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
