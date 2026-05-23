package com.talenthub.job.infrastructure.persistence.repository;

import com.talenthub.job.domain.entity.JobSkill;
import com.talenthub.job.domain.entity.JobSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}
