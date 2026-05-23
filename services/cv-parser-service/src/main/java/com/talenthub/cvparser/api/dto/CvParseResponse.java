package com.talenthub.cvparser.api.dto;

import com.talenthub.cvparser.domain.enums.CvParseStatus;

public record CvParseResponse(Long cvId, Long candidateId, String filePath, String parsedData,
                              CvParseStatus parseStatus) {
}
