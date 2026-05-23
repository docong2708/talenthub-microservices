package com.talenthub.commonevents.application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

public record ApplicationStageChangedEvent(UUID eventId, Instant occurredAt, Long applicationId,
                                           Long fromStageId, Long toStageId, Long movedBy,
                                           LocalDateTime movedAt) {
}
