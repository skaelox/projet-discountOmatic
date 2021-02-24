package fr.dawan.discountomatic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.dto.SupplierDto;
import fr.dawan.discountomatic.services.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	/**
	 * Mapping de l'object article
	 * Mapping des différente méthode de l'objet article correspondant aux
	 * différentes méthodes du crud
	 */
	
	@GetMapping(value = "/article", produces = "application/json")
	public List<ArticleDto> getAllArticle() {
		return adminService.getAllArticle();
	}
	
	@GetMapping(value = "/",produces = "application/json")
    public ArticleDto getArticleById(@RequestParam long id) {
	    return adminService.findArticleById(id);
	}
	
	@PostMapping(value = "/article", consumes = "application/json" , produces = "application/json")
	public ArticleDto saveArticle(@RequestBody ArticleDto aDto) {
		return adminService.saveOrUpdateArticle(aDto);	
	}
	
	@DeleteMapping(value = "/article", produces = "test/plain")
	public String deleteArticle(@RequestBody ArticleDto aDto) {
		try {
			adminService.deleteArticleById(aDto);
			return "done";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
	@PutMapping(value = "/article", produces = "application/json")
	public ArticleDto updateArticle(ArticleDto aDto) {
		return adminService.saveOrUpdateArticle(aDto);
	}
	
	/**
	 * Mapping de l'object category
	 * Mapping des différente méthode de l'objet category correspondant aux
	 * différentes méthodes du crud
	 */
	
	@GetMapping(value = "/categories", produces = "application/json")
	public List<CategoryDto> getAllCategory() {
		return adminService.getAllCategory();
	} 
	
	@GetMapping(value = "/category", produces = "application/json")
	public CategoryDto getCategoryById(@RequestParam("id") long id) {
	    return adminService.findCategoryById(id);
	}
	
	@PostMapping(value = "/category", consumes = "application/json" , produces = "application/json")
	public CategoryDto saveCategory(@RequestBody CategoryDto cDto) {
		return adminService.saveOrUpdateCategory(cDto);	
	}
	
	@DeleteMapping(value = "/category", produces = "test/plain")
	public String deleteCategory(@RequestBody CategoryDto cDto) {
		try {
			adminService.deleteCategoryById(cDto);
			return "done";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
	@PutMapping(value = "/category", produces = "application/json")
	public CategoryDto updateCategory(CategoryDto cDto) {
		return adminService.saveOrUpdateCategory(cDto);
	}
	
	/**
	 * Mapping de l'object customer
	 * Mapping des différente méthode de l'objet customer correspondant aux
	 * différentes méthodes du crud
	 */
	
	@GetMapping(value = "/customers", produces = "application/json")
	public List<CustomerDto> getAllCustomer() {
		return adminService.getAllCustomer();
	}
	
	@GetMapping(value = "/customer", produces = "application/json")
	public CustomerDto getCustomerById(@RequestParam("id") long id) {
	    return adminService.findCustomerById(id);
	}
	
	@PostMapping(value = "/customer", consumes = "application/json" , produces = "application/json")
	public CustomerDto saveCustomer(@RequestBody CustomerDto cDto) {
		return adminService.saveOrUpdateCustomer(cDto);	
	}
	
	@DeleteMapping(value = "/customer", produces = "test/plain")
	public String deleteCustomer(@RequestBody CustomerDto cDto) {
		try {
			adminService.deleteCustomerById(cDto);
			return "done";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
	@PutMapping(value = "/customer", produces = "application/json")
	public CustomerDto updateCustomer(CustomerDto cDto) {
		return adminService.saveOrUpdateCustomer(cDto);
	}
	
	/**
	 * Mapping de l'object Supplier
	 * Mapping des différente méthode de l'objet Supplier correspondant aux
	 * différentes méthodes du crud
	 */
	
	@GetMapping(value = "/supplier", produces = "application/json")
	public List<SupplierDto> getAllSupplierr() {
		return adminService.getAllSupplier();
	}
	
	@PostMapping(value = "/supplier", consumes = "application/json" , produces = "application/json")
	public SupplierDto saveSupplier(@RequestBody SupplierDto cDto) {
		return adminService.saveOrUpdateSupplier(cDto);	
	}
	
	@DeleteMapping(value = "/supplier", produces = "test/plain")
	public String deleteSupplier(@RequestBody SupplierDto cDto) {
		try {
			adminService.deleteSupplierById(cDto);
			return "done";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		
	}
	
	@PutMapping(value = "/supplier", produces = "application/json")
	public SupplierDto updateSupplier(SupplierDto cDto) {
		return adminService.saveOrUpdateSupplier(cDto);
	}
	
}
