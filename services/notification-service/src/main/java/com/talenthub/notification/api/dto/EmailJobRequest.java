package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.EmailJobStatus;

import java.time.LocalDateTime;

public record EmailJobRequest(Long applicationId, Long emailTemplateId, String recipientEmail,
                              EmailJobStatus status, LocalDateTime sentAt) {
}
