package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.EmailActionType;

import java.time.LocalDateTime;

public record ActionableEmailTokenRequest(Long applicationId, String tokenHash, EmailActionType actionType,
                                          LocalDateTime expiresAt, LocalDateTime usedAt) {
}
