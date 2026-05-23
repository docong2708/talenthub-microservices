package com.talenthub.application.domain.entity;

import com.talenthub.application.domain.enums.ApplicationStatus;
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
@Table(name = "applications")
public class Application extends AuditableEntity {
    private Long jobId;
    private Long candidateId;
    private Long cvId;
    private Long departmentId;
    private Long pipelineStageId;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private LocalDateTime appliedAt;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
