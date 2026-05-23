package com.talenthub.notification.infrastructure.persistence.repository;

import com.talenthub.notification.domain.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
