package com.talenthub.cvparser.api.dto;

public record CvParseRequest(Long cvId, Long candidateId, String filePath) {
}
