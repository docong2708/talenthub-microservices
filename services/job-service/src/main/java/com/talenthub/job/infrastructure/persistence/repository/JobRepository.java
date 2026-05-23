package com.talenthub.job.infrastructure.persistence.repository;

import com.talenthub.job.domain.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
