package model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@NamedQueries({
	@NamedQuery(name = "getAllStockItems", query = "select s from StockItem s")
})

@Entity
public class StockItem {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	
	private String title;
	private String manufacturer;
	private double price;
	private int stockLevel;
	
	@Lob
	@Column(name="image", nullable=false, columnDefinition="mediumblob")
	private byte[] image;
	
	@ManyToOne
	private Category category;
	
	public StockItem() {}
	
	
	public StockItem(String title, String manufacturer, double price, int stockLevel) {
		this.title = title;
		this.manufacturer = manufacturer;
		this.price = price;
		this.stockLevel = stockLevel;
		
	}	

	
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public int getStockLevel() {
		return stockLevel;
	}


	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
