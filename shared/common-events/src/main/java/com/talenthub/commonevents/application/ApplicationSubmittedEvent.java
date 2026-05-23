package com.talenthub.commonevents.application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public record ApplicationSubmittedEvent(UUID eventId, Instant occurredAt, Long applicationId,
                                        Long candidateId, Long jobId, Long cvId, Long pipelineStageId,
                                        String status, LocalDateTime appliedAt) {
}
