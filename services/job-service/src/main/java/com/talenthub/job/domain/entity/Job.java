package com.talenthub.job.domain.entity;

import com.talenthub.job.domain.enums.JobStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "jobs")
public class Job extends AuditableEntity {
    private Long departmentId;
    private Long recruiterId;
    private String title;

    @Lob
    private String description;

    private String location;
    private BigDecimal salaryMin;
    private BigDecimal salaryMax;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private LocalDateTime publishedAt;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
