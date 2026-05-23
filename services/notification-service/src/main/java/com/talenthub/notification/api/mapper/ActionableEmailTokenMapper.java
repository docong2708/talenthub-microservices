package com.talenthub.notification.api.mapper;

import com.talenthub.notification.api.dto.ActionableEmailTokenRequest;
import com.talenthub.notification.api.dto.ActionableEmailTokenResponse;
import com.talenthub.notification.domain.entity.ActionableEmailToken;

public final class ActionableEmailTokenMapper {
    private ActionableEmailTokenMapper() {
    }

    public static ActionableEmailToken toEntity(ActionableEmailTokenRequest request) {
        ActionableEmailToken token = new ActionableEmailToken();
        updateEntity(token, request);
        return token;
    }

    public static void updateEntity(ActionableEmailToken token, ActionableEmailTokenRequest request) {
        token.setApplicationId(request.applicationId());
        token.setTokenHash(request.tokenHash());
        token.setActionType(request.actionType());
        token.setExpiresAt(request.expiresAt());
        token.setUsedAt(request.usedAt());
    }

    public static ActionableEmailTokenResponse toResponse(ActionableEmailToken token) {
        return new ActionableEmailTokenResponse(token.getId(), token.getApplicationId(), token.getTokenHash(),
                token.getActionType(), token.getExpiresAt(), token.getUsedAt(), token.getCreatedAt(),
                token.getUpdatedAt(), token.getCreatedBy(), token.getUpdatedBy(), token.getIsDeleted(),
                token.getDeletedAt());
    }
}
