package com.mycompany.clinic.modules.documents.domain;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class DocumentMapper {


    public static final DocumentMapper DOCUMENT_MAPPER = Mappers.getMapper(DocumentMapper.class);


    public Document toDocument(DocumentRequest request) {

        Document document = new Document();
        document.setDocumentType(request.documentType());
        document.setNumber(request.number());
        document.setValidUntil(request.validUntil());
        return document;
    }

    public void toDocument(DocumentRequest request, Document document) {

        if (document.getDocumentType() != null)
            document.setDocumentType(request.documentType());

        if (document.getNumber() != null)
            document.setNumber(request.number());

        if (document.getValidUntil() != null)
            document.setValidUntil(request.validUntil());
    }

    public DocumentResponse toResponse(Document document) {
        return new DocumentResponse(
                document.getId(),
                document.getDocumentType(),
                document.getNumber(),
                document.getValidUntil()
        );
    }

}
