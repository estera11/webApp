package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dao.CategoryDAO;
import dao.StockItemDAO;
import dao.UserDAO;
import iterator.ArrayListStockItem;
import iterator.Iterator;
import model.Category;
import model.StockItem;
import model.User;


@Path("/service")
public class CatalogueService {
	
	private static StockItemDAO stockItemDao = new StockItemDAO();
	private static CategoryDAO categoryDao = new CategoryDAO();
	private static Category categ1, categ2, categ3, categ4 ;

	
	static {
		 categ1 = new Category("Condiments");
		 categ2 = new Category("Oil & Fat");
		 categ3 = new Category("Dairy & Eggs");
		 categ4 = new Category("Tinned Food");
		 addItem();
	}
	
	
	public static String addItem() {
		
        File file = new File("C:\\Users\\Estera\\git\\webApp\\WebAppAssignment\\src\\anchovy.jpg");
        byte[] bFile = new byte[(int) file.length()];
 
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StockItem item1 = new StockItem("Anchovy paste", "Fish LTD", 15, 100);
        item1.setImage(bFile);
        
        categoryDao.persist(categ1);
		categoryDao.persist(categ2);
		categoryDao.persist(categ3);
		categoryDao.persist(categ4);
        
        item1.setCategory(categ1);
        stockItemDao.persistStockItem(item1);
		
		
		return "Hello There Buddy World";
	}
	
	@POST
	@Path("/regCustomer")
	public String createCustomer(@FormParam("name") String name, @FormParam("password") String pass, @FormParam("payMethod") String paymentMethod,
			@FormParam("address") String address) {
		UserDAO userDao = new UserDAO();
		User user = new User.UserBuilder(name, pass)
				.withPaymentMethod(paymentMethod)
				.withShippingAddress(address)
				.buildUser();
		user.setType("customer");
		userDao.persistUser(user);
		
		return "Registered Successfully";
		
	}
	
	
	
	@POST
	@Path("/regAdmin")
	@Produces("text/plain")
	@Consumes("application/x-www-form-urlencoded")
	public String createAdmin(@FormParam("name") String name, @FormParam("password") String pass) {
		UserDAO userDao = new UserDAO();
		User user = new User.UserBuilder(name, pass)
				.buildUser();
		user.setType("admin");
		userDao.persistUser(user);
		System.out.println(user.toString());
		return "Registered Successfully";
		
	}
	
	@GET
	@Path("/getNext")
	@Produces("application/json")
	public StockItem getNext() {
	 ArrayListStockItem arrayItems = new ArrayListStockItem();
	 List<StockItem> items = stockItemDao.getStockItems();
	 for(StockItem item : items) {
		 arrayItems.addItem(item);
	 }
	 Iterator iteratorArrayList = arrayItems.getIterator();
		return (StockItem) iteratorArrayList.next() ;
		
	}
	
	@GET
	@Path("/getPrevious")
	@Produces("application/json")
	public StockItem getPrevious() {
	 ArrayListStockItem arrayItems = new ArrayListStockItem();
	 List<StockItem> items = stockItemDao.getStockItems();
	 for(StockItem item : items) {
		 arrayItems.addItem(item);
	 }
	 Iterator iteratorArrayList = arrayItems.getIterator();
		return (StockItem) iteratorArrayList.previous() ;
		
	}
}
