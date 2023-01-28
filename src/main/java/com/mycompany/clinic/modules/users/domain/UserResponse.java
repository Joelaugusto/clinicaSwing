package com.mycompany.clinic.modules.users.domain;

import com.mycompany.clinic.modules.documents.domain.DocumentResponse;

public record UserResponse(Long id, String firstName, String lastName, Role role, DocumentResponse document) {
}
