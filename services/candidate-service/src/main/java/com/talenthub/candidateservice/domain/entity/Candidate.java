package com.talenthub.candidateservice.domain.entity;

import com.talenthub.candidateservice.domain.enums.CandidateStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate extends AuditableEntity {
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    private String passwordHash;
    private String authProvider;

    @Enumerated(EnumType.STRING)
    private CandidateStatus status;

    private String phone;
    private String source;
    private String utmSource;
    private String utmMedium;
    private String utmCampaign;
    private Boolean isDuplicate = false;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
