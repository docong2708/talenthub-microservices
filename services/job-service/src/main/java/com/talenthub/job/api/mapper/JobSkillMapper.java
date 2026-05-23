package com.talenthub.job.api.mapper;

import com.talenthub.job.api.dto.JobSkillRequest;
import com.talenthub.job.api.dto.JobSkillResponse;
import com.talenthub.job.domain.entity.JobSkill;
import com.talenthub.job.domain.entity.JobSkillId;

public final class JobSkillMapper {
    private JobSkillMapper() {
    }

    public static JobSkill toEntity(JobSkillRequest request) {
        JobSkill jobSkill = new JobSkill();
        jobSkill.setId(new JobSkillId(request.jobId(), request.skillId()));
        return jobSkill;
    }

    public static JobSkillResponse toResponse(JobSkill jobSkill) {
        return new JobSkillResponse(jobSkill.getId().getJobId(), jobSkill.getId().getSkillId());
    }
}
