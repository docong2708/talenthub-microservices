package com.talenthub.notification.domain.entity;

import com.talenthub.notification.domain.enums.EmailActionType;
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
@Table(name = "actionable_email_tokens")
public class ActionableEmailToken extends AuditableEntity {
    private Long applicationId;
    private String tokenHash;

    @Enumerated(EnumType.STRING)
    private EmailActionType actionType;

    private LocalDateTime expiresAt;
    private LocalDateTime usedAt;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
