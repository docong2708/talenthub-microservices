package com.talenthub.notification.infrastructure.persistence.repository;

import com.talenthub.notification.domain.entity.EmailJob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailJobRepository extends JpaRepository<EmailJob, Long> {
}
