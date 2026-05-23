package com.talenthub.notification.infrastructure.persistence.repository;

import com.talenthub.notification.domain.entity.EmailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailTemplateRepository extends JpaRepository<EmailTemplate, Long> {
}
