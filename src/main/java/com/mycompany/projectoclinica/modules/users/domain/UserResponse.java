package com.mycompany.projectoclinica.modules.users.domain;

import com.mycompany.projectoclinica.modules.documents.domain.DocumentResponse;

public record UserResponse(Long id, String firstName, String lastName, Role role, DocumentResponse document) {
}
