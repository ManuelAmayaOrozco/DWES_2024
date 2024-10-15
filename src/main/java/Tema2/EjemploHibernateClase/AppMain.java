package Tema2.EjemploHibernateClase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruebaMySQL");
        EntityManager em = emf.createEntityManager();

        //1º Empezar una transacción
        em.getTransaction().begin();

        //2º Se realizan las operaciones que queramos
        //Vamos a hacer un insert
        Director direc = new Director("778899JOE", "Paco Jones", 70, 300.00, null);
        Direccion dir = new Direccion("Calle Senda Perdida", 8, "11010", null);
        Cine cine = new Cine("Yelmo Cines Bahía Sur", 500, dir, direc);
        em.persist(direc);
        em.persist(dir);
        em.persist(cine);

        //3º Para reflejar los cambios en la base de datos... commit()
        em.getTransaction().commit();

        //HACER CONSULTA BDD
        //1º Abrir la transcacción
        em.getTransaction().begin();

        //2º Realizar las operaciones. CONSULTA
        Cine cineBusqueda = em.find(Cine.class, 1);

        System.out.println(cineBusqueda.getNombre());
        //System.out.println(cineBusqueda.getDireccion().getCalle());

        System.out.println(cineBusqueda.getDireccion().getCine().getNombre());


    }
}
