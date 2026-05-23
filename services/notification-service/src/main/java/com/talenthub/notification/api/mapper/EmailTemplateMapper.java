package com.talenthub.notification.api.mapper;

import com.talenthub.notification.api.dto.EmailTemplateRequest;
import com.talenthub.notification.api.dto.EmailTemplateResponse;
import com.talenthub.notification.domain.entity.EmailTemplate;

public final class EmailTemplateMapper {
    private EmailTemplateMapper() {
    }

    public static EmailTemplate toEntity(EmailTemplateRequest request) {
        EmailTemplate template = new EmailTemplate();
        updateEntity(template, request);
        return template;
    }

    public static void updateEntity(EmailTemplate template, EmailTemplateRequest request) {
        template.setTemplateName(request.templateName());
        template.setType(request.type());
        template.setSubject(request.subject());
        template.setBodyHtml(request.bodyHtml());
        template.setPlaceholders(request.placeholders());
        template.setIsActive(request.isActive());
    }

    public static EmailTemplateResponse toResponse(EmailTemplate template) {
        return new EmailTemplateResponse(template.getId(), template.getTemplateName(), template.getType(),
                template.getSubject(), template.getBodyHtml(), template.getPlaceholders(), template.getIsActive(),
                template.getCreatedAt(), template.getUpdatedAt(), template.getCreatedBy(), template.getUpdatedBy(),
                template.getIsDeleted(), template.getDeletedAt());
    }
}
