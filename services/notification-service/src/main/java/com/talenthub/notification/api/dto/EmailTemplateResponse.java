package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.NotificationType;

import java.time.LocalDateTime;

public record EmailTemplateResponse(Long id, String templateName, NotificationType type, String subject,
                                    String bodyHtml, String placeholders, Boolean isActive,
                                    LocalDateTime createdAt, LocalDateTime updatedAt, Long createdBy,
                                    Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
