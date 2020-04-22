package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Purchase {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private double totalPrice;
	
	@OneToMany
	private List<StockItem> items = new ArrayList<>();
	
	public Purchase() {}
	
	
	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public List<StockItem> getItems() {
		return items;
	}


	public void setItems(List<StockItem> items) {
		this.items = items;
	}
	
	
	
	
}
