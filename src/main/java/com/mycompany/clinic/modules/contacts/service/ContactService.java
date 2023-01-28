package com.mycompany.clinic.modules.contacts.service;

import com.mycompany.clinic.modules.contacts.domain.Contact;
import com.mycompany.clinic.modules.contacts.domain.ContactRequest;

import java.util.List;

public interface ContactService {

    Contact findById(Long id);

    Contact create(ContactRequest request);

    Contact update(Long id, ContactRequest request);

    void delete(Long id);

    List<Contact> findAll();

}
