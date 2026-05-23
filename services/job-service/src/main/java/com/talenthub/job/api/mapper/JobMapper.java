package com.talenthub.job.api.mapper;

import com.talenthub.job.api.dto.JobRequest;
import com.talenthub.job.api.dto.JobResponse;
import com.talenthub.job.domain.entity.Job;

public final class JobMapper {
    private JobMapper() {
    }

    public static Job toEntity(JobRequest request) {
        Job job = new Job();
        updateEntity(job, request);
        return job;
    }

    public static void updateEntity(Job job, JobRequest request) {
        job.setDepartmentId(request.departmentId());
        job.setRecruiterId(request.recruiterId());
        job.setTitle(request.title());
        job.setDescription(request.description());
        job.setLocation(request.location());
        job.setSalaryMin(request.salaryMin());
        job.setSalaryMax(request.salaryMax());
        job.setStatus(request.status());
        job.setPublishedAt(request.publishedAt());
    }

    public static JobResponse toResponse(Job job) {
        return new JobResponse(job.getId(), job.getDepartmentId(), job.getRecruiterId(), job.getTitle(),
                job.getDescription(), job.getLocation(), job.getSalaryMin(), job.getSalaryMax(), job.getStatus(),
                job.getPublishedAt(), job.getCreatedAt(), job.getUpdatedAt(), job.getCreatedBy(), job.getUpdatedBy(),
                job.getIsDeleted(), job.getDeletedAt());
    }
}
