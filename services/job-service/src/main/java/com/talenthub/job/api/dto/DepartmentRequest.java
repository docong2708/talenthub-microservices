package com.talenthub.job.api.dto;

public record DepartmentRequest(Long parentId, String departmentName, String description) {
}
