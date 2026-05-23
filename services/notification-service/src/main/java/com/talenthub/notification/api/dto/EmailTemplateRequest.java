package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.NotificationType;

public record EmailTemplateRequest(String templateName, NotificationType type, String subject, String bodyHtml,
                                   String placeholders, Boolean isActive) {
}
