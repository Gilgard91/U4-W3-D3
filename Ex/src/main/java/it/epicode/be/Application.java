package it.epicode.be;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

//        System.out.println("Esercitazione D2");
//
//
//        EventoDAO ed = new EventoDAO(em);
//
//        Evento beatles = new Evento("Beatles", "25/01/24", "Concerto", tipoEvento.PUBBLICO, 100);
//
//        ed.save(beatles);


        em.close();
        emf.close();
    }
}
