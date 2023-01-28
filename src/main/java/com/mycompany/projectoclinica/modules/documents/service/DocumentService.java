package com.mycompany.projectoclinica.modules.documents.service;

import com.mycompany.projectoclinica.modules.documents.domain.Document;
import com.mycompany.projectoclinica.modules.documents.domain.DocumentRequest;

import java.util.List;

public interface DocumentService {

    Document findById(Long id);

    Document create(DocumentRequest request);

    Document update(Long id, DocumentRequest request);

    void delete(Long id);

    List<Document> findAll();
}
