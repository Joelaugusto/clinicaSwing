package com.mycompany.clinic.modules.documents.domain;

import com.mycompany.clinic.modules.users.domain.User;

import java.time.LocalDate;

public record DocumentRequest(DocumentType documentType, String number, LocalDate validUntil, User user) {
}
