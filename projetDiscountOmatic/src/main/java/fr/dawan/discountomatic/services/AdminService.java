package fr.dawan.discountomatic.services;

import java.util.List;

import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.dto.SupplierDto;

public interface AdminService {

	List<ArticleDto> getAllArticle();
	ArticleDto findArticleById(long id);
	void deleteArticleById(ArticleDto a);
	ArticleDto saveOrUpdateArticle(ArticleDto aDto);
	
	List<CategoryDto> getAllCategory();
	CategoryDto findCategoryById(long id);
	void deleteCategoryById(CategoryDto cDto);
	CategoryDto saveOrUpdateCategory(CategoryDto cDto);
	
	List<CustomerDto> getAllCustomer();
	CustomerDto findCustomerById(long id);
	void deleteCustomerById(CustomerDto cDto);
	CustomerDto saveOrUpdateCustomer(CustomerDto cDto);
	
	List<SupplierDto> getAllSupplier();
	SupplierDto findSupplierById(long id);
	void deleteSupplierById(SupplierDto sDto);
	SupplierDto saveOrUpdateSupplier(SupplierDto sDto);
	
}
