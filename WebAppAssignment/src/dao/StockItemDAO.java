package dao;

import javax.persistence.EntityManager;

import model.EntityManagerProvider;
import model.StockItem;
import model.User;

public class StockItemDAO {
	public StockItemDAO() {}

	public void persistStockItem(StockItem item) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		
	}
	public void mergeStockItem(StockItem item) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removeStockItem(StockItem item) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(item));
		em.getTransaction().commit();
		em.close();
	}
}
