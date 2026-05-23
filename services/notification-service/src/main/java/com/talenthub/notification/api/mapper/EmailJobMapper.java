package com.talenthub.notification.api.mapper;

import com.talenthub.notification.api.dto.EmailJobRequest;
import com.talenthub.notification.api.dto.EmailJobResponse;
import com.talenthub.notification.domain.entity.EmailJob;

public final class EmailJobMapper {
    private EmailJobMapper() {
    }

    public static EmailJob toEntity(EmailJobRequest request) {
        EmailJob job = new EmailJob();
        updateEntity(job, request);
        return job;
    }

    public static void updateEntity(EmailJob job, EmailJobRequest request) {
        job.setApplicationId(request.applicationId());
        job.setEmailTemplateId(request.emailTemplateId());
        job.setRecipientEmail(request.recipientEmail());
        job.setStatus(request.status());
        job.setSentAt(request.sentAt());
    }

    public static EmailJobResponse toResponse(EmailJob job) {
        return new EmailJobResponse(job.getId(), job.getApplicationId(), job.getEmailTemplateId(),
                job.getRecipientEmail(), job.getStatus(), job.getSentAt(), job.getCreatedAt(), job.getUpdatedAt(),
                job.getCreatedBy(), job.getUpdatedBy(), job.getIsDeleted(), job.getDeletedAt());
    }
}
