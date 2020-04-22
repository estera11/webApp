package dao;

import javax.persistence.EntityManager;

import model.Category;
import model.EntityManagerProvider;

public class CategoryDAO {
public CategoryDAO() {}
	
	public void persist(Category category) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();
		em.close();
		
	}
	public void merge(Category category) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();
		em.close();
		
	}
	public void remove(Category category) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(category));
		em.getTransaction().commit();
		em.close();
	}

}
