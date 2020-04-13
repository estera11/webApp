package dao;

import javax.persistence.EntityManager;

import model.EntityManagerProvider;
import model.Image;


public class ImageDAO {
	public ImageDAO() {}
	
	public void persistImage(Image image) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(image);
		em.getTransaction().commit();
		em.close();
		
	}
	public void mergeImage(Image image) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(image);
		em.getTransaction().commit();
		em.close();
		
	}
	public void removeImage(Image image) {
		EntityManager em = EntityManagerProvider.getInstance().getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(em.merge(image));
		em.getTransaction().commit();
		em.close();
	}

}
