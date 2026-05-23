package com.talenthub.candidateservice.api.dto;

import com.talenthub.candidateservice.domain.enums.CvParseStatus;

import java.time.LocalDateTime;

public record CvRequest(
        Long candidateId,
        String filePath,
        String fileType,
        String parsedData,
        CvParseStatus parseStatus,
        LocalDateTime uploadedAt
) {
}
