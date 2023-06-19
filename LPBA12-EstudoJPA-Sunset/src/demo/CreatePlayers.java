package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreatePlayers {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPBA12-EstudoJPA-SunsetPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        Player p1 = new Player();
        p1.setId(7);
        p1.setFirstname("Ian");
        p1.setJerseynumber(30);
        p1.setLastname("Thorpe");
        p1.setLastspokenwords("I am in the best form");
        em.persist(p1);

        Player p2 = new Player();
        p2.setId(8);
        p2.setFirstname("Deigo");
        p2.setJerseynumber(40);
        p2.setLastname("Maradona");
        p2.setLastspokenwords("I will be back");
        em.persist(p2);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
