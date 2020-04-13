package model;

public class User {
	
	private int id;
	private String name;
	private String password;
	private String type;
	private String shippingAddress;
	private String paymentMethod;

	public User(UserBuilder builder) {
		this.name = builder.name;
		this.password = builder.password;
		this.type = builder.type;
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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public static class UserBuilder{
		
		private String name;
		private String password;
		private String type;
		private String shippingAddress;
		private String paymentMethod;
		
		public UserBuilder(String username, String password, String type){
			this.name = username;
			this.password = password;
			this.type = type;
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
