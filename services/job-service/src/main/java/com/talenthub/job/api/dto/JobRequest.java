package com.talenthub.job.api.dto;

import com.talenthub.job.domain.enums.JobStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record JobRequest(Long departmentId, Long recruiterId, String title, String description,
                         String location, BigDecimal salaryMin, BigDecimal salaryMax,
                         JobStatus status, LocalDateTime publishedAt) {
}
