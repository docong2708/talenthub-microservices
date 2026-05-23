package com.talenthub.commonevents.notification;

import java.time.Instant;
import java.util.UUID;

public record NotificationRequestedEvent(UUID eventId, Instant occurredAt, Long userId, String type,
                                         String title, String message) {
}
