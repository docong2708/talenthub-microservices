package com.talenthub.candidateservice.api.mapper;

import com.talenthub.candidateservice.api.dto.CvRequest;
import com.talenthub.candidateservice.api.dto.CvResponse;
import com.talenthub.candidateservice.domain.entity.Cv;

public final class CvMapper {
    private CvMapper() {
    }

    public static Cv toEntity(CvRequest request) {
        Cv cv = new Cv();
        updateEntity(cv, request);
        return cv;
    }

    public static void updateEntity(Cv cv, CvRequest request) {
        cv.setCandidateId(request.candidateId());
        cv.setFilePath(request.filePath());
        cv.setFileType(request.fileType());
        cv.setParsedData(request.parsedData());
        cv.setParseStatus(request.parseStatus());
        cv.setUploadedAt(request.uploadedAt());
    }

    public static CvResponse toResponse(Cv cv) {
        return new CvResponse(
                cv.getId(),
                cv.getCandidateId(),
                cv.getFilePath(),
                cv.getFileType(),
                cv.getParsedData(),
                cv.getParseStatus(),
                cv.getUploadedAt(),
                cv.getCreatedAt(),
                cv.getUpdatedAt(),
                cv.getCreatedBy(),
                cv.getUpdatedBy(),
                cv.getIsDeleted(),
                cv.getDeletedAt()
        );
    }
}
