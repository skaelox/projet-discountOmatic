package fr.dawan.discountomatic.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;


@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private long articleId;
	@Column(name = "article_name")
	private String name;
	@Column(name = "article_description", unique = true)
	private String description;
	@Column(name = "article_price")
	private double price;
	@Column(name = "article_quantity")
	private int quantity;
	@Column(name = "article_visibility")
	private boolean visibility;
	
	@ManyToMany(mappedBy = "articles", cascade = CascadeType.ALL)
	@Column(name = "article_category")
	private List<Category> categories;
	
	@Version
	private int version;
	
	public Article() {
		
	}
	
	public Article(long articleId, String name, String description, double price, int quantity, boolean visibility,
			List<Category> categories) {
		super();
		this.articleId = articleId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.visibility = visibility;
		this.categories = categories;
	}
	public long getArticleId() {
		return articleId;
	}
	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
}
