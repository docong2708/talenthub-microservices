package com.talenthub.commonevents.notification;

import java.time.Instant;
import java.util.UUID;

public record EmailRequestedEvent(UUID eventId, Instant occurredAt, Long applicationId,
                                  Long templateId, String recipientEmail) {
}
