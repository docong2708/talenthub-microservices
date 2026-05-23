package com.talenthub.notification.infrastructure.persistence.repository;

import com.talenthub.notification.domain.entity.ActionableEmailToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionableEmailTokenRepository extends JpaRepository<ActionableEmailToken, Long> {
}
