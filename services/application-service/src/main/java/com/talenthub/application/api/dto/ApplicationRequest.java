package com.talenthub.application.api.dto;

import com.talenthub.application.domain.enums.ApplicationStatus;

import java.time.LocalDateTime;

public record ApplicationRequest(Long jobId, Long candidateId, Long cvId, Long departmentId,
                                 Long pipelineStageId, ApplicationStatus status, LocalDateTime appliedAt) {
}
