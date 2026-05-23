package com.talenthub.notification.api.dto;

import com.talenthub.notification.domain.enums.EmailActionType;

import java.time.LocalDateTime;

public record ActionableEmailTokenResponse(Long id, Long applicationId, String tokenHash,
                                           EmailActionType actionType, LocalDateTime expiresAt,
                                           LocalDateTime usedAt, LocalDateTime createdAt,
                                           LocalDateTime updatedAt, Long createdBy, Long updatedBy,
                                           Boolean isDeleted, LocalDateTime deletedAt) {
}
