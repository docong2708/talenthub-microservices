package com.talenthub.application.api.mapper;

import com.talenthub.application.api.dto.ApplicationRequest;
import com.talenthub.application.api.dto.ApplicationResponse;
import com.talenthub.application.domain.entity.Application;

public final class ApplicationMapper {
    private ApplicationMapper() {
    }

    public static Application toEntity(ApplicationRequest request) {
        Application application = new Application();
        updateEntity(application, request);
        return application;
    }

    public static void updateEntity(Application application, ApplicationRequest request) {
        application.setJobId(request.jobId());
        application.setCandidateId(request.candidateId());
        application.setCvId(request.cvId());
        application.setDepartmentId(request.departmentId());
        application.setPipelineStageId(request.pipelineStageId());
        application.setStatus(request.status());
        application.setAppliedAt(request.appliedAt());
    }

    public static ApplicationResponse toResponse(Application application) {
        return new ApplicationResponse(application.getId(), application.getJobId(), application.getCandidateId(),
                application.getCvId(), application.getDepartmentId(), application.getPipelineStageId(),
                application.getStatus(), application.getAppliedAt(), application.getCreatedAt(),
                application.getUpdatedAt(), application.getCreatedBy(), application.getUpdatedBy(),
                application.getIsDeleted(), application.getDeletedAt());
    }
}
