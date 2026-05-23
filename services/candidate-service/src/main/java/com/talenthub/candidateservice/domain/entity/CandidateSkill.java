package com.talenthub.candidateservice.domain.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "candidate_skills")
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillId id;
}
