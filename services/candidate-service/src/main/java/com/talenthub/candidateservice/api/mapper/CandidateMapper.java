package com.talenthub.candidateservice.api.mapper;

import com.talenthub.candidateservice.api.dto.CandidateRequest;
import com.talenthub.candidateservice.api.dto.CandidateResponse;
import com.talenthub.candidateservice.domain.entity.Candidate;

public final class CandidateMapper {
    private CandidateMapper() {
    }

    public static Candidate toEntity(CandidateRequest request) {
        Candidate candidate = new Candidate();
        updateEntity(candidate, request);
        return candidate;
    }

    public static void updateEntity(Candidate candidate, CandidateRequest request) {
        candidate.setFullName(request.fullName());
        candidate.setEmail(request.email());
        candidate.setPasswordHash(request.passwordHash());
        candidate.setAuthProvider(request.authProvider());
        candidate.setStatus(request.status());
        candidate.setPhone(request.phone());
        candidate.setSource(request.source());
        candidate.setUtmSource(request.utmSource());
        candidate.setUtmMedium(request.utmMedium());
        candidate.setUtmCampaign(request.utmCampaign());
        candidate.setIsDuplicate(request.isDuplicate());
    }

    public static CandidateResponse toResponse(Candidate candidate) {
        return new CandidateResponse(
                candidate.getId(),
                candidate.getFullName(),
                candidate.getEmail(),
                candidate.getAuthProvider(),
                candidate.getStatus(),
                candidate.getPhone(),
                candidate.getSource(),
                candidate.getUtmSource(),
                candidate.getUtmMedium(),
                candidate.getUtmCampaign(),
                candidate.getIsDuplicate(),
                candidate.getCreatedAt(),
                candidate.getUpdatedAt(),
                candidate.getCreatedBy(),
                candidate.getUpdatedBy(),
                candidate.getIsDeleted(),
                candidate.getDeletedAt()
        );
    }
}
