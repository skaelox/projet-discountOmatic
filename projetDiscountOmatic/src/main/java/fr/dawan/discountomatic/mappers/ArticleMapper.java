package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.dto.ArticleDto;

public class ArticleMapper {

	public static ArticleDto toDto(Article a) {
		ModelMapper m = new ModelMapper();
		m.typeMap(Article.class, ArticleDto.class).addMappings(mapper -> {
			mapper.map(src -> src.getName(), ArticleDto::setName);
			mapper.map(src -> src.getDescription(), ArticleDto::setDescription);
			mapper.map(src -> src.getPrice(), ArticleDto::setPrice);
			mapper.map(src -> src.getQuantity(), ArticleDto::setQuantity);
			mapper.map(src -> src.isVisibility(), ArticleDto::setVisibility);
			mapper.map(src -> src.getCategories(), ArticleDto::setCategories);
		});
		return m.map(a, ArticleDto.class);
	}
}
	