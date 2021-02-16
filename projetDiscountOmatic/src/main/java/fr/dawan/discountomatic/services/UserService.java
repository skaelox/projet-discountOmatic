package fr.dawan.discountomatic.services;

import java.util.List;

import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;

public interface UserService {
    
    List<ArticleDto> getAllArticle();
    
    List<CategoryDto> getAllCategory();
    
    CustomerDto findAllByMailAndPassword(String mail, String password);
}

