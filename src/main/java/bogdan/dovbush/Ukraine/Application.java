package bogdan.dovbush.Ukraine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application extends Exception{
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");

        EntityManager em = factory.createEntityManager();

        em.close();
        factory.close();
    }
}
