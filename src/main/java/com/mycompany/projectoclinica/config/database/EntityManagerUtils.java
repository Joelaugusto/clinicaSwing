package com.mycompany.projectoclinica.config.database;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EntityManagerUtils {

    private static final EntityManager MANAGER = Persistence
            .createEntityManagerFactory("clinic")
            .createEntityManager();
    public static EntityManager getEntityManager () {
        return MANAGER;
    }
}
