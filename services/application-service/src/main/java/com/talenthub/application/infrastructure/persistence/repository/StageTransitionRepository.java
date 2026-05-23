package com.talenthub.application.infrastructure.persistence.repository;

import com.talenthub.application.domain.entity.StageTransition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageTransitionRepository extends JpaRepository<StageTransition, Long> {
}
