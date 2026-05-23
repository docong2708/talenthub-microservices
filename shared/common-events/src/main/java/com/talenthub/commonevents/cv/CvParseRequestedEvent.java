package com.talenthub.commonevents.cv;

import java.time.Instant;
import java.util.UUID;

public record CvParseRequestedEvent(UUID eventId, Instant occurredAt, Long cvId, Long candidateId,
                                    String filePath) {
}
