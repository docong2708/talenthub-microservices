package com.talenthub.application.infrastructure.persistence.repository;

import com.talenthub.application.domain.entity.EvaluationNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationNoteRepository extends JpaRepository<EvaluationNote, Long> {
}
