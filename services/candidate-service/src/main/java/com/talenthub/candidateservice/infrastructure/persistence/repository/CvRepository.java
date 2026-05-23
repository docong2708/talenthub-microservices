package com.talenthub.candidateservice.infrastructure.persistence.repository;

import com.talenthub.candidateservice.domain.entity.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<Cv, Long> {
}
