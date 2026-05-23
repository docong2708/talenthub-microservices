package com.talenthub.candidateservice.domain.entity;

import com.talenthub.candidateservice.domain.enums.CvParseStatus;
import jakarta.persistence.Column;
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

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cvs")
public class Cv extends AuditableEntity {
    @Column(nullable = false)
    private Long candidateId;

    private String filePath;
    private String fileType;

    @Lob
    private String parsedData;

    @Enumerated(EnumType.STRING)
    private CvParseStatus parseStatus;

    private LocalDateTime uploadedAt;

    @PrePersist
    void prePersist() {
        setCreatedAt(LocalDateTime.now());
    }

    @PreUpdate
    void preUpdate() {
        setUpdatedAt(LocalDateTime.now());
    }
}
