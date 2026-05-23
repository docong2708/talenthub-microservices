package com.talenthub.application.api.dto;

public record PipelineStageRequest(String stageName, Integer stageOrder, String color, Boolean isDefault) {
}
