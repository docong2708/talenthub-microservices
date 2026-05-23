package com.talenthub.candidateservice.api.dto;

import com.talenthub.candidateservice.domain.enums.CandidateStatus;

public record CandidateRequest(
        String fullName,
        String email,
        String passwordHash,
        String authProvider,
        CandidateStatus status,
        String phone,
        String source,
        String utmSource,
        String utmMedium,
        String utmCampaign,
        Boolean isDuplicate
) {
}
