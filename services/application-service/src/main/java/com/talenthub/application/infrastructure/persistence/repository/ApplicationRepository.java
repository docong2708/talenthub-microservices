package com.talenthub.application.infrastructure.persistence.repository;

import com.talenthub.application.domain.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
