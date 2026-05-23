package com.talenthub.job.api.dto;

import java.time.LocalDateTime;

public record DepartmentResponse(Long id, Long parentId, String departmentName, String description,
                                 LocalDateTime createdAt, LocalDateTime updatedAt, Long createdBy,
                                 Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
