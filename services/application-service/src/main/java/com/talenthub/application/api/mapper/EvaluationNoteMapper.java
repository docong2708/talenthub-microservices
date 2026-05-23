package com.talenthub.application.api.mapper;

import com.talenthub.application.api.dto.EvaluationNoteRequest;
import com.talenthub.application.api.dto.EvaluationNoteResponse;
import com.talenthub.application.domain.entity.EvaluationNote;

public final class EvaluationNoteMapper {
    private EvaluationNoteMapper() {
    }

    public static EvaluationNote toEntity(EvaluationNoteRequest request) {
        EvaluationNote note = new EvaluationNote();
        updateEntity(note, request);
        return note;
    }

    public static void updateEntity(EvaluationNote note, EvaluationNoteRequest request) {
        note.setApplicationId(request.applicationId());
        note.setContent(request.content());
    }

    public static EvaluationNoteResponse toResponse(EvaluationNote note) {
        return new EvaluationNoteResponse(note.getId(), note.getApplicationId(), note.getContent(),
                note.getCreatedAt(), note.getUpdatedAt(), note.getCreatedBy(), note.getUpdatedBy(),
                note.getIsDeleted(), note.getDeletedAt());
    }
}
