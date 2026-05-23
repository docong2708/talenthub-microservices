package com.talenthub.application.api.dto;

import java.time.LocalDateTime;

public record EvaluationNoteResponse(Long id, Long applicationId, String content, LocalDateTime createdAt,
                                     LocalDateTime updatedAt, Long createdBy, Long updatedBy,
                                     Boolean isDeleted, LocalDateTime deletedAt) {
}
