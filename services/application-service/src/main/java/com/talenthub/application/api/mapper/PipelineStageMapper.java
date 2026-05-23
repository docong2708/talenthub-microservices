package com.talenthub.application.api.mapper;

import com.talenthub.application.api.dto.PipelineStageRequest;
import com.talenthub.application.api.dto.PipelineStageResponse;
import com.talenthub.application.domain.entity.PipelineStage;

public final class PipelineStageMapper {
    private PipelineStageMapper() {
    }

    public static PipelineStage toEntity(PipelineStageRequest request) {
        PipelineStage stage = new PipelineStage();
        updateEntity(stage, request);
        return stage;
    }

    public static void updateEntity(PipelineStage stage, PipelineStageRequest request) {
        stage.setStageName(request.stageName());
        stage.setStageOrder(request.stageOrder());
        stage.setColor(request.color());
        stage.setIsDefault(request.isDefault());
    }

    public static PipelineStageResponse toResponse(PipelineStage stage) {
        return new PipelineStageResponse(stage.getId(), stage.getStageName(), stage.getStageOrder(),
                stage.getColor(), stage.getIsDefault(), stage.getCreatedBy(), stage.getCreatedAt(),
                stage.getUpdatedAt(), stage.getUpdatedBy(), stage.getIsDeleted(), stage.getDeletedAt());
    }
}
