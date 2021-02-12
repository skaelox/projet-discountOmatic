package fr.dawan.discountomatic.dto;

import java.io.Serializable;
import java.util.List;

public class ArticleDto implements Serializable{

	private static final long serialVersionUID = -8724762065323807841L;
	
	private String name;
	private String Description;
	private double price;
	private int quantity;
	private boolean visibility;
	private List<CategoryDto> categories;
	
	public ArticleDto() {
		
	}

	public ArticleDto(String name, String description, double price, int quantity, boolean visibility,
			List<CategoryDto> categories) {
		super();
		this.name = name;
		Description = description;
		this.price = price;
		this.quantity = quantity;
		this.visibility = visibility;
		this.categories = categories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isVisibility() {
		return visibility;
	}

	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}

	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
