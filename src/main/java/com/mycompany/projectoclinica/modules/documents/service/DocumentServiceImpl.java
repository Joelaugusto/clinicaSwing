package com.mycompany.projectoclinica.modules.documents.service;

import com.mycompany.projectoclinica.config.database.EntityManagerUtils;
import com.mycompany.projectoclinica.modules.documents.domain.Document;
import com.mycompany.projectoclinica.modules.documents.domain.DocumentMapper;
import com.mycompany.projectoclinica.modules.documents.domain.DocumentRequest;

import javax.persistence.EntityManager;
import java.util.List;

public class DocumentServiceImpl implements DocumentService {

    private final EntityManager manager = EntityManagerUtils.getEntityManager();

    @Override
    public Document findById(Long id) {
        manager.getTransaction().begin();
        var document = manager.find(Document.class, id);
        manager.getTransaction().commit();
        return document;
    }

    @Override
    public Document create(DocumentRequest request) {

        var document = DocumentMapper.DOCUMENT_MAPPER.toDocument(request);
        manager.getTransaction().begin();
        manager.persist(document);
        manager.getTransaction().commit();
        return document;
    }

    @Override
    public Document update(Long id, DocumentRequest request) {
        var document = findById(id);
        DocumentMapper.DOCUMENT_MAPPER.toDocument(request, document);
        manager.getTransaction().begin();
        manager.persist(document);
        manager.getTransaction().commit();
        return document;
    }

    @Override
    public void delete(Long id) {
        manager.remove(findById(id));
    }

    @Override
    public List<Document> findAll() {
        manager.getTransaction().begin();
        return manager.createQuery("select d from Document d").getResultList();
    }
}
