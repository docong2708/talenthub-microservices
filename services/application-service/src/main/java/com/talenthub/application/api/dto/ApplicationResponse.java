package com.talenthub.application.api.dto;

import com.talenthub.application.domain.enums.ApplicationStatus;

import java.time.LocalDateTime;

public record ApplicationResponse(Long id, Long jobId, Long candidateId, Long cvId, Long departmentId,
                                  Long pipelineStageId, ApplicationStatus status, LocalDateTime appliedAt,
                                  LocalDateTime createdAt, LocalDateTime updatedAt, Long createdBy,
                                  Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
