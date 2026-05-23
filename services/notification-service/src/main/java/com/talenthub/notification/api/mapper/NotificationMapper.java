package com.talenthub.notification.api.mapper;

import com.talenthub.notification.api.dto.NotificationRequest;
import com.talenthub.notification.api.dto.NotificationResponse;
import com.talenthub.notification.domain.entity.Notification;

public final class NotificationMapper {
    private NotificationMapper() {
    }

    public static Notification toEntity(NotificationRequest request) {
        Notification notification = new Notification();
        updateEntity(notification, request);
        return notification;
    }

    public static void updateEntity(Notification notification, NotificationRequest request) {
        notification.setUserId(request.userId());
        notification.setType(request.type());
        notification.setTitle(request.title());
        notification.setMessage(request.message());
        notification.setIsRead(request.isRead());
    }

    public static NotificationResponse toResponse(Notification notification) {
        return new NotificationResponse(notification.getId(), notification.getUserId(), notification.getType(),
                notification.getTitle(), notification.getMessage(), notification.getIsRead(),
                notification.getCreatedAt(), notification.getUpdatedAt(), notification.getCreatedBy(),
                notification.getUpdatedBy(), notification.getIsDeleted(), notification.getDeletedAt());
    }
}
