package fr.dawan.discountomatic.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private long customeId;
	@Column(name = "customer_name")
	private String name;
	@Column(name = "customer_description")
	private String description;

	@ManyToMany
	private List<Article> articles;

	@Version
	private int version;

	public Category() {

	}

	public Category(long customeId, String name, String description, List<Article> articles) {
		this.customeId = customeId;
		this.name = name;
		this.description = description;
		this.articles = articles;
	}

	public long getCustomeId() {
		return customeId;
	}

	public void setCustomeId(long customeId) {
		this.customeId = customeId;
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

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
