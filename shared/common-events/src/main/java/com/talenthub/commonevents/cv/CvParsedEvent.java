package com.talenthub.commonevents.cv;

import java.time.Instant;
import java.util.UUID;

public record CvParsedEvent(UUID eventId, Instant occurredAt, Long cvId, Long candidateId,
                            String parsedData, String parseStatus) {
}
