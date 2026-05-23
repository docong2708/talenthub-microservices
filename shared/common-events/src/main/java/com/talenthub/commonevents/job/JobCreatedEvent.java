package com.talenthub.commonevents.job;

import java.time.Instant;
import java.util.UUID;

public record JobCreatedEvent(UUID eventId, Instant occurredAt, Long jobId, String title,
                              Long departmentId, Long recruiterId, String status) {
}
