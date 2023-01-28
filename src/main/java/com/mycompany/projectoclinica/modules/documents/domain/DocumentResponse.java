package com.mycompany.projectoclinica.modules.documents.domain;

import java.time.LocalDate;

public record DocumentResponse(Long id, DocumentType documentType, String number,
                               LocalDate validUntil) { }
