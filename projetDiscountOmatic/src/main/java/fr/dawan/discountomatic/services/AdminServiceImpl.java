package fr.dawan.discountomatic.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.discountomatic.beans.Address;
import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.beans.Category;
import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.beans.Supplier;
import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.dto.SupplierDto;
import fr.dawan.discountomatic.mappers.AddressMapper;
import fr.dawan.discountomatic.mappers.ArticleMapper;
import fr.dawan.discountomatic.mappers.CategoryMapper;
import fr.dawan.discountomatic.mappers.CustomerMapper;
import fr.dawan.discountomatic.mappers.SupplierMapper;
import fr.dawan.discountomatic.repositories.AddressRepository;
import fr.dawan.discountomatic.repositories.ArticleRepository;
import fr.dawan.discountomatic.repositories.CategoryRepository;
import fr.dawan.discountomatic.repositories.CustomerRepository;
import fr.dawan.discountomatic.repositories.SupplierRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	SupplierRepository supplierRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AddressRepository addressRepository;

	@Override
	public List<ArticleDto> getAllArticle() {
		return articleRepository.findAll().stream().map(ArticleMapper::toDto).collect(Collectors.toList());	
	}

	@Override
	public ArticleDto findArticleById(long id) {
		Optional<Article> opt = articleRepository.findById(id);
		return opt.isPresent() ? ArticleMapper.toDto(opt.get()) : null;
	}

	@Override
	public void deleteArticleById(ArticleDto a) {
		Article res = articleRepository.findArticleByName(a.getName());;
		articleRepository.deleteById(res.getArticleId());
		
	}

	@Override
	public ArticleDto saveOrUpdateArticle(ArticleDto aDto) {
		ModelMapper m = new ModelMapper();
        Article a = m.map(aDto, Article.class);
        a = articleRepository.saveAndFlush(a);
        return m.map(a, ArticleDto.class);
	}

	@Override
	public List<CategoryDto> getAllCategory() {
		return categoryRepository.findAll().stream().map(CategoryMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public CategoryDto findCategoryById(long id) {
		Optional<Category> opt = categoryRepository.findById(id);
		return opt.isPresent() ? CategoryMapper.toDto(opt.get()) : null;
	}

	@Override
	public void deleteCategoryById(CategoryDto cDto) {
		Category res = categoryRepository.findCategoryByName(cDto.getName());
		categoryRepository.deleteById(res.getCategoryId());
		
	}

	@Override
	public CategoryDto saveOrUpdateCategory(CategoryDto cDto) {
		ModelMapper m = new ModelMapper();
		Category c = m.map(cDto, Category.class);
        c = categoryRepository.saveAndFlush(c);
        return m.map(c, CategoryDto.class);
	}

	@Override
	public List<CustomerDto> getAllCustomer() {
		return customerRepository.findAll().stream().map(CustomerMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public CustomerDto findCustomerById(long id) {
		Optional<Customer> opt = customerRepository.findById(id);
		return opt.isPresent() ? CustomerMapper.toDto(opt.get()) : null;
	}

	@Override
	public void deleteCustomerById(CustomerDto cDto) {
		//TODO cfaire appel à la future methode search by name
		long id =0;
		customerRepository.deleteById(id);
		
	}

	@Override
	public CustomerDto saveOrUpdateCustomer(CustomerDto cDto) {
		ModelMapper m = new ModelMapper();
		Customer c = m.map(cDto, Customer.class);
		Address a = AddressMapper.fromDto(cDto.getAdress());
		a = addressRepository.saveAndFlush(a);
		c.setAddress(a);
        c = customerRepository.saveAndFlush(c);
        return m.map(c, CustomerDto.class);
	}

	@Override
	public List<SupplierDto> getAllSupplier() {
		return supplierRepository.findAll().stream().map(SupplierMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public SupplierDto findSupplierById(long id) {
		Optional<Supplier> opt = supplierRepository.findById(id);
		return opt.isPresent() ? SupplierMapper.toDto(opt.get()) : null;
	}

	@Override
	public void deleteSupplierById(SupplierDto sDto) {
		long id = 0;
		supplierRepository.deleteById(id);
		
	}

	@Override
	public SupplierDto saveOrUpdateSupplier(SupplierDto sDto) {
		ModelMapper m = new ModelMapper();
		Supplier s = m.map(sDto, Supplier.class);
        s = supplierRepository.saveAndFlush(s);
        return m.map(s, SupplierDto.class);
	}

}
