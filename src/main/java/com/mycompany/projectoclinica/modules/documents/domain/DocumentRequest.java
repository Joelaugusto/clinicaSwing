package com.mycompany.projectoclinica.modules.documents.domain;

import com.mycompany.projectoclinica.modules.users.domain.User;

import java.time.LocalDate;

public record DocumentRequest(DocumentType documentType, String number, LocalDate validUntil, User user) {
}
