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
	private String picture;
	private long articleId;
	
	public ArticleDto() {
		
	}


	public ArticleDto(String name, String description, double price, int quantity, boolean visibility,
			List<CategoryDto> categories, String picture, long articleId) {
		super();
		this.name = name;
		Description = description;
		this.price = price;
		this.quantity = quantity;
		this.visibility = visibility;
		this.categories = categories;
		this.picture = picture;
		this.articleId = articleId;
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
	

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public long getArticleId() {
		return articleId;
	}


	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}
	
	
	
}
