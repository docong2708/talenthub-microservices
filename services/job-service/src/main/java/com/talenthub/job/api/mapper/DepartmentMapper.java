package com.talenthub.job.api.mapper;

import com.talenthub.job.api.dto.DepartmentRequest;
import com.talenthub.job.api.dto.DepartmentResponse;
import com.talenthub.job.domain.entity.Department;

public final class DepartmentMapper {
    private DepartmentMapper() {
    }

    public static Department toEntity(DepartmentRequest request) {
        Department department = new Department();
        updateEntity(department, request);
        return department;
    }

    public static void updateEntity(Department department, DepartmentRequest request) {
        department.setParentId(request.parentId());
        department.setDepartmentName(request.departmentName());
        department.setDescription(request.description());
    }

    public static DepartmentResponse toResponse(Department department) {
        return new DepartmentResponse(department.getId(), department.getParentId(), department.getDepartmentName(),
                department.getDescription(), department.getCreatedAt(), department.getUpdatedAt(),
                department.getCreatedBy(), department.getUpdatedBy(), department.getIsDeleted(),
                department.getDeletedAt());
    }
}
