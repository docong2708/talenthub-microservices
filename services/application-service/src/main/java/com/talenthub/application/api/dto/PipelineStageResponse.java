package com.talenthub.application.api.dto;

import java.time.LocalDateTime;

public record PipelineStageResponse(Long id, String stageName, Integer stageOrder, String color, Boolean isDefault,
                                    Long createdBy, LocalDateTime createdAt, LocalDateTime updatedAt,
                                    Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
