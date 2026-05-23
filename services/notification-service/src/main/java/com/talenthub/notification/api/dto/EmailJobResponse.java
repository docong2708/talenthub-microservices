package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.EmailJobStatus;

import java.time.LocalDateTime;

public record EmailJobResponse(Long id, Long applicationId, Long emailTemplateId, String recipientEmail,
                               EmailJobStatus status, LocalDateTime sentAt, LocalDateTime createdAt,
                               LocalDateTime updatedAt, Long createdBy, Long updatedBy,
                               Boolean isDeleted, LocalDateTime deletedAt) {
}
