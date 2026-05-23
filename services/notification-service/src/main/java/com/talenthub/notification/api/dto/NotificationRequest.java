package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.NotificationType;

public record NotificationRequest(Long userId, NotificationType type, String title, String message, Boolean isRead) {
}
