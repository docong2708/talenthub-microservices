package com.talenthub.job.api.dto;

import com.talenthub.job.domain.enums.JobStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobResponse(Long id, Long departmentId, Long recruiterId, String title, String description,
                          String location, BigDecimal salaryMin, BigDecimal salaryMax, JobStatus status,
                          LocalDateTime publishedAt, LocalDateTime createdAt, LocalDateTime updatedAt,
                          Long createdBy, Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
