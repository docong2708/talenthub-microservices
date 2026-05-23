package com.talenthub.application.api.dto;

import java.time.LocalDateTime;

public record StageTransitionResponse(Long id, Long applicationId, Long fromStageId, Long toStageId, String notes,
                                      LocalDateTime movedAt, Long movedBy, LocalDateTime createdAt,
                                      LocalDateTime updatedAt, Long createdBy, Long updatedBy,
                                      Boolean isDeleted, LocalDateTime deletedAt) {
}
