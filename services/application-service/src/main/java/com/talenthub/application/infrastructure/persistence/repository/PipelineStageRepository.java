package com.talenthub.application.infrastructure.persistence.repository;

import com.talenthub.application.domain.entity.PipelineStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PipelineStageRepository extends JpaRepository<PipelineStage, Long> {
}
