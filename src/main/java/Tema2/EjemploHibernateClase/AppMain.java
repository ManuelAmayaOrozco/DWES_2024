package Tema2.EjemploHibernateClase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruebaMySQL");
        EntityManager em = emf.createEntityManager();

    }
}
