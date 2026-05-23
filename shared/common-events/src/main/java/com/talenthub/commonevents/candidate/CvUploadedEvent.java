package com.talenthub.commonevents.candidate;

import java.time.Instant;
import java.util.UUID;

public record CvUploadedEvent(UUID eventId, Instant occurredAt, Long cvId, Long candidateId,
                              String filePath, String fileType) {
}
