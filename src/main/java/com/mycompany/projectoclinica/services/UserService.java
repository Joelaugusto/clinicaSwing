package com.mycompany.projectoclinica.services;

import com.mycompany.projectoclinica.config.database.EntityManagerUtils;
import com.mycompany.projectoclinica.model.user.User;
import com.mycompany.projectoclinica.model.user.UserRequest;

import javax.persistence.EntityManager;

public class UserService {

    private final EntityManager manager = EntityManagerUtils.getEntityManager();
    public User findById(Long id) {
        manager.getTransaction().begin();
        var user = manager.find(User.class, id);
        manager.getTransaction().commit();
//        manager.close();
        return user;
    }

    public User createUser (UserRequest request) {
        var user = new User();
        user.setName(request.name());
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
//        manager.close();
        return user;

    }
}
