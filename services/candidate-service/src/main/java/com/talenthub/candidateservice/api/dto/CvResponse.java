package com.talenthub.candidateservice.api.dto;

import com.talenthub.candidateservice.domain.enums.CvParseStatus;

import java.time.LocalDateTime;

public record CvResponse(
        Long id,
        Long candidateId,
        String filePath,
        String fileType,
        String parsedData,
        CvParseStatus parseStatus,
        LocalDateTime uploadedAt,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long createdBy,
        Long updatedBy,
        Boolean isDeleted,
        LocalDateTime deletedAt
) {
}
