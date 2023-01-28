package com.mycompany.clinic.modules.documents.domain;

import java.time.LocalDate;

public record DocumentResponse(Long id, DocumentType documentType, String number,
                               LocalDate validUntil) { }
