package com.mycompany.projectoclinica.modules.contacts.service;

import com.mycompany.projectoclinica.config.database.EntityManagerUtils;
import com.mycompany.projectoclinica.modules.contacts.domain.Contact;
import com.mycompany.projectoclinica.modules.contacts.domain.ContactMapper;
import com.mycompany.projectoclinica.modules.contacts.domain.ContactRequest;
import com.mycompany.projectoclinica.modules.documents.domain.Document;
import com.mycompany.projectoclinica.modules.documents.domain.DocumentMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class ContactServiceImpl implements ContactService {


    private final EntityManager manager = EntityManagerUtils.getEntityManager();

    @Override
    public Contact findById(Long id) {
        manager.getTransaction().begin();
        var contact = manager.find(Contact.class, id);
        manager.getTransaction().commit();
        return contact;
    }

    @Override
    public Contact create(ContactRequest request) {
        var contact = ContactMapper.CONTACT_MAPPER.toContact(request);
        manager.getTransaction().begin();
        manager.persist(contact);
        manager.getTransaction().commit();
        return contact;
    }

    @Override
    public Contact update(Long id, ContactRequest request) {
        var contact = findById(id);
        ContactMapper.CONTACT_MAPPER.toContact(request, contact);
        manager.getTransaction().begin();
        manager.persist(contact);
        manager.getTransaction().commit();
        return contact;
    }

    @Override
    public void delete(Long id) {
        manager.remove(findById(id));
    }

    @Override
    public List<Contact> findAll() {
        manager.getTransaction().begin();
        return manager.createQuery("select c from Contact c").getResultList();
    }
}
