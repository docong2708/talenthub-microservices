package com.talenthub.commonevents.candidate;

import java.time.Instant;
import java.util.UUID;

public record CandidateCreatedEvent(UUID eventId, Instant occurredAt, Long candidateId, String fullName,
                                    String email, String phone, String source) {
}
