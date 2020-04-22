package dao;

import javax.persistence.EntityManager;

import model.EntityManagerProvider;
import model.Purchase;


public class PurchaseDAO {
	public PurchaseDAO() {}
	
	public void persistOrder(Purchase order) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		em.close();
		
	}
	public void mergeOrder(Purchase order) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removeOrder(Purchase order) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(order));
		em.getTransaction().commit();
		em.close();
	}

}
