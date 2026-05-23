package com.talenthub.application.api.dto;

import java.time.LocalDateTime;

public record StageTransitionRequest(Long applicationId, Long fromStageId, Long toStageId, String notes,
                                     LocalDateTime movedAt, Long movedBy) {
}
