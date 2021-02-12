package fr.dawan.discountomatic.dto;

import java.util.List;

public class CategoryDto {

	private String name;
	private String description;
	
	private List<ArticleDto> articles;
	
	public CategoryDto() {
		
	}

	public CategoryDto(String name, String description, List<ArticleDto> articles) {
		super();
		this.name = name;
		this.description = description;
		this.articles = articles;
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

	public List<ArticleDto> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleDto> articles) {
		this.articles = articles;
	}
	
	
}
