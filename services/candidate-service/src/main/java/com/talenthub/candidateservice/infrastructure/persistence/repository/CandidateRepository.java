package com.talenthub.candidateservice.infrastructure.persistence.repository;

import com.talenthub.candidateservice.domain.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
