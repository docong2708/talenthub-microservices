package com.talenthub.candidateservice.api.mapper;

import com.talenthub.candidateservice.api.dto.CandidateSkillRequest;
import com.talenthub.candidateservice.api.dto.CandidateSkillResponse;
import com.talenthub.candidateservice.domain.entity.CandidateSkill;
import com.talenthub.candidateservice.domain.entity.CandidateSkillId;

public final class CandidateSkillMapper {
    private CandidateSkillMapper() {
    }

    public static CandidateSkill toEntity(CandidateSkillRequest request) {
        CandidateSkill candidateSkill = new CandidateSkill();
        candidateSkill.setId(new CandidateSkillId(request.candidateId(), request.skillId()));
        return candidateSkill;
    }

    public static CandidateSkillResponse toResponse(CandidateSkill candidateSkill) {
        return new CandidateSkillResponse(
                candidateSkill.getId().getCandidateId(),
                candidateSkill.getId().getSkillId()
        );
    }
}
