import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
	
    public static final boolean DEBUG = true;
    
    private static final EntityManagerProvider entityManagerInstance = new EntityManagerProvider();
   
    protected EntityManagerFactory entityManagerFactory;
    
    private EntityManagerProvider () {}
    
    public  EntityManagerFactory getInstance() {
    	 if(entityManagerFactory ==  null)
    		 createEntityManagerFactory();
    	 return entityManagerFactory;
    }
    
    public void createEntityManagerFactory() {
    	this.entityManagerFactory = Persistence.createEntityManagerFactory("webPersistence");
    	if(DEBUG) {
    	   System.out.println(" Persistence started at " + new java.util.Date());
    	}
    }
    
    public void closeEntityManagerFactory() {
        
        if (entityManagerFactory != null) {
        	entityManagerFactory.close();
        	entityManagerFactory = null;
          if (DEBUG)
            System.out.println(" Persistence finished at " + new java.util.Date());
        }
      }

}