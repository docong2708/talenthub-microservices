package com.talenthub.cvparser.api.mapper;

import com.talenthub.commonevents.cv.CvParsedEvent;
import com.talenthub.cvparser.api.dto.CvParseResponse;
import com.talenthub.cvparser.domain.enums.CvParseStatus;

import java.time.Instant;
import java.util.UUID;

public final class CvParseMapper {
    private CvParseMapper() {
    }

    public static CvParseResponse toResponse(Long cvId, Long candidateId, String filePath,
                                             String parsedData, CvParseStatus parseStatus) {
        return new CvParseResponse(cvId, candidateId, filePath, parsedData, parseStatus);
    }

    public static CvParsedEvent toParsedEvent(CvParseResponse response) {
        return new CvParsedEvent(UUID.randomUUID(), Instant.now(), response.cvId(), response.candidateId(),
                response.parsedData(), response.parseStatus().name());
    }
}
