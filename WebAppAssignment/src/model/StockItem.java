package model;

public class StockItem {
	private String title;
	private String manufacturer;
	private double price;
	private String category;
	private Image image;
	

	public StockItem() {}
	
	public StockItem(String title, String manufacturer, double price, String category, Image image) {
		super();
		this.title = title;
		this.manufacturer = manufacturer;
		this.price = price;
		this.category = category;
		this.image = image;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
	
}
