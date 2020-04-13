package service;

import model.User;

public class Service {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Mark", "password123", "customer")
				.withPaymentMethod("Visa Card")
				.withShippingAddress("10 Temple Court Dublin Ireland")
				.buildUser();
		
		System.out.println(user.toString());
	}

}
