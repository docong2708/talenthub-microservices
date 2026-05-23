package com.talenthub.notification.domain.entity;

import com.talenthub.notification.domain.enums.EmailJobStatus;
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
@Table(name = "email_jobs")
public class EmailJob extends AuditableEntity {
    private Long applicationId;
    private Long emailTemplateId;
    private String recipientEmail;

    @Enumerated(EnumType.STRING)
    private EmailJobStatus status;

    private LocalDateTime sentAt;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
