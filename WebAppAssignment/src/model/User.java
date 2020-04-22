package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@NamedQueries({
		@NamedQuery(name = "getUser", query = "select u from User u where u.name = ?1"),
})


@Entity
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String password;
	private String type;

	private String shippingAddress;
	
	private String paymentMethod;
	
	@OneToMany
	private List<Purchase> orders = new ArrayList<>();

	
	public User() {}

	public User(UserBuilder builder) {
		this.name = builder.name;
		this.password = builder.password;
		this.shippingAddress = builder.shippingAddress;
		this.paymentMethod = builder.paymentMethod;
	}
	
	

	public String getShippingAddress() {
		return shippingAddress;
	}



	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}



	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public String getUsername() {
		return name;
	}



	public void setUsername(String username) {
		this.name = username;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + name + ", password=" + password + ", type=" + type
				+ ", shippingAddress=" + shippingAddress + ", paymentMethod=" + paymentMethod + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Purchase> getOrders() {
		return orders;
	}

	public void setOrders(List<Purchase> orders) {
		this.orders = orders;
	}





	public static class UserBuilder{
		
		private String name;
		private String password;
		private String type;
		private String shippingAddress;
		private String paymentMethod;
		
		public UserBuilder(String username, String password){
			this.name = username;
			this.password = password;
	}
		
		public UserBuilder withShippingAddress(String address) {
			this.shippingAddress = address;
			return this;
		}
		
		public UserBuilder withPaymentMethod(String payMethod) {
			this.paymentMethod = payMethod;
			return this;
		}
		
		public User buildUser() {
			return new User(this);
		}
	
	}
}
