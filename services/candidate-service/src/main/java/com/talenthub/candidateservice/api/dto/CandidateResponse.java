package com.talenthub.candidateservice.api.dto;

import com.talenthub.candidateservice.domain.enums.CandidateStatus;

import java.time.LocalDateTime;

public record CandidateResponse(
        Long id,
        String fullName,
        String email,
        String authProvider,
        CandidateStatus status,
        String phone,
        String source,
        String utmSource,
        String utmMedium,
        String utmCampaign,
        Boolean isDuplicate,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long createdBy,
        Long updatedBy,
        Boolean isDeleted,
        LocalDateTime deletedAt
) {
}
