package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.NotificationType;

import java.time.LocalDateTime;

public record NotificationResponse(Long id, Long userId, NotificationType type, String title, String message,
                                   Boolean isRead, LocalDateTime createdAt, LocalDateTime updatedAt,
                                   Long createdBy, Long updatedBy, Boolean isDeleted, LocalDateTime deletedAt) {
}
