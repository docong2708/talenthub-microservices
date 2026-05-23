package com.talenthub.candidateservice.infrastructure.persistence.repository;

import com.talenthub.candidateservice.domain.entity.CandidateSkill;
import com.talenthub.candidateservice.domain.entity.CandidateSkillId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}
