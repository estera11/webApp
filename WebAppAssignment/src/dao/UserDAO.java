package dao;

import javax.persistence.EntityManager;

import model.EntityManagerProvider;
import model.Image;
import model.User;

public class UserDAO {
	public UserDAO() {}
	
	public void persistUser(User user) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		
	}
	public void mergeUser(User user) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removeUser(User user) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(user));
		em.getTransaction().commit();
		em.close();
	}

}
