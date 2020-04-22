package dao;

import javax.persistence.EntityManager;


import model.EntityManagerProvider;
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
	
	public boolean validateUserExists(String username, String password) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		User user = (User) em.createNamedQuery("getUser").setParameter(1, username).getSingleResult();
		 if (user != null && user.getPassword().equals(password)) {
             return true;
         }else
        	 return false;
	}
	public User getUser(String username, String password) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		User user = (User) em.createNamedQuery("getUser").setParameter(1, username).getSingleResult();
		 if (user != null && user.getPassword().equals(password)) {
             return user;
         }else
        	 return null;
	}

}
