package com.talenthub.application.api.mapper;

import com.talenthub.application.api.dto.StageTransitionRequest;
import com.talenthub.application.api.dto.StageTransitionResponse;
import com.talenthub.application.domain.entity.StageTransition;

public final class StageTransitionMapper {
    private StageTransitionMapper() {
    }

    public static StageTransition toEntity(StageTransitionRequest request) {
        StageTransition transition = new StageTransition();
        updateEntity(transition, request);
        return transition;
    }

    public static void updateEntity(StageTransition transition, StageTransitionRequest request) {
        transition.setApplicationId(request.applicationId());
        transition.setFromStageId(request.fromStageId());
        transition.setToStageId(request.toStageId());
        transition.setNotes(request.notes());
        transition.setMovedAt(request.movedAt());
        transition.setMovedBy(request.movedBy());
    }

    public static StageTransitionResponse toResponse(StageTransition transition) {
        return new StageTransitionResponse(transition.getId(), transition.getApplicationId(),
                transition.getFromStageId(), transition.getToStageId(), transition.getNotes(),
                transition.getMovedAt(), transition.getMovedBy(), transition.getCreatedAt(),
                transition.getUpdatedAt(), transition.getCreatedBy(), transition.getUpdatedBy(),
                transition.getIsDeleted(), transition.getDeletedAt());
    }
}
