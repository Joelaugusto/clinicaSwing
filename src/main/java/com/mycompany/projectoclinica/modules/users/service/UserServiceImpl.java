package com.mycompany.projectoclinica.modules.users.service;

import com.mycompany.projectoclinica.config.database.EntityManagerUtils;
import com.mycompany.projectoclinica.modules.contacts.service.ContactService;
import com.mycompany.projectoclinica.modules.contacts.service.ContactServiceImpl;
import com.mycompany.projectoclinica.modules.documents.service.DocumentService;
import com.mycompany.projectoclinica.modules.documents.service.DocumentServiceImpl;
import com.mycompany.projectoclinica.modules.users.domain.User;
import com.mycompany.projectoclinica.modules.users.domain.UserRequest;

import javax.persistence.EntityManager;

import java.util.List;

import static com.mycompany.projectoclinica.modules.users.domain.UserMapper.USER_MAPPER;

public class UserServiceImpl implements UserService {

    private final EntityManager manager = EntityManagerUtils.getEntityManager();
    private final DocumentService documentService;
    private final ContactService contactService;

    public UserServiceImpl() {
        documentService = new DocumentServiceImpl();
        contactService = new ContactServiceImpl();
    }


    public User findById(Long id) {
        manager.getTransaction().begin();
        var user = manager.find(User.class, id);
        manager.getTransaction().commit();
        return user;
    }

    public User create(UserRequest request) {
        var user = USER_MAPPER.toUser(request);
        user.setDocument(documentService.create(request.document()));
        user.setContact(contactService.create(request.contact()));
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
        return user;
    }

    public User update(Long id, UserRequest request){
        var user = findById(id);
        USER_MAPPER.toUser(request, user);
        if (request.document() != null)
            user.setDocument(documentService.update(user.getDocument().getId() ,request.document()));
        if (request.contact() != null)
            user.setContact(contactService.update(user.getContact().getId() ,request.contact()));
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
        return user;
    }

    public void delete(Long id) {
        manager.remove(findById(id));
    }

    public List<User> findAll() {
        manager.getTransaction().begin();
        return manager.createQuery("select u from User u").getResultList();
    }
}
