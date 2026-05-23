package com.talenthub.job.api.dto;

import java.time.LocalDateTime;

public record SkillResponse(Long id, String skillName, String category, LocalDateTime createdAt,
                            LocalDateTime updatedAt, Long createdBy, Long updatedBy,
                            Boolean isDeleted, LocalDateTime deletedAt) {
}
