package br.edu.utfpr.pb.douglas.favero.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("TrabalhoFinalPU");
        }
        return emf.createEntityManager();
    }
}
