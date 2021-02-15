package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Category;
import fr.dawan.discountomatic.dto.CategoryDto;

public class CategoryMapper {

	public static CategoryDto toDto(Category c) {
		ModelMapper m = new ModelMapper();
		m.typeMap(Category.class, CategoryDto.class).addMappings(mapper -> {
			mapper.map(src -> src.getName(), CategoryDto::setName);
			mapper.map(src -> src.getDescription(), CategoryDto::setDescription);
			mapper.map(src -> src.getArticles(), CategoryDto::setArticles);
		});
		return m.map(c, CategoryDto.class);
	}
}
