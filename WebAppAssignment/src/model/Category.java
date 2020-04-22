package model;

import javax.persistence.*;

@Entity
public class Category {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String categoryName;
	
	public Category() {}
	
	public Category(String categName) {
		this.categoryName = categName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
