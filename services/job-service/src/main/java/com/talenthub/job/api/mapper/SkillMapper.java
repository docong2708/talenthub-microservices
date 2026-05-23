package com.talenthub.job.api.mapper;

import com.talenthub.job.api.dto.SkillRequest;
import com.talenthub.job.api.dto.SkillResponse;
import com.talenthub.job.domain.entity.Skill;

public final class SkillMapper {
    private SkillMapper() {
    }

    public static Skill toEntity(SkillRequest request) {
        Skill skill = new Skill();
        updateEntity(skill, request);
        return skill;
    }

    public static void updateEntity(Skill skill, SkillRequest request) {
        skill.setSkillName(request.skillName());
        skill.setCategory(request.category());
    }

    public static SkillResponse toResponse(Skill skill) {
        return new SkillResponse(skill.getId(), skill.getSkillName(), skill.getCategory(), skill.getCreatedAt(),
                skill.getUpdatedAt(), skill.getCreatedBy(), skill.getUpdatedBy(), skill.getIsDeleted(),
                skill.getDeletedAt());
    }
}
