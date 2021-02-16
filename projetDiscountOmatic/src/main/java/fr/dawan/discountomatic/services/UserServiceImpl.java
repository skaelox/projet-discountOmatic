package fr.dawan.discountomatic.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.beans.Category;
import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.dto.ArticleDto;
import fr.dawan.discountomatic.dto.CategoryDto;
import fr.dawan.discountomatic.dto.CustomerDto;
import fr.dawan.discountomatic.repositories.ArticleRepository;
import fr.dawan.discountomatic.repositories.CategoryRepository;
import fr.dawan.discountomatic.repositories.CustomerRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CustomerRepository customerRepository;
    
    @Override
    public List<ArticleDto> getAllArticle() {
        List<Article> listArticle = articleRepository.findAll();
        List<ArticleDto> res = new ArrayList<ArticleDto>();
        ModelMapper m = new ModelMapper();
        for(Article a : listArticle) {
            res.add(m.map(a, ArticleDto.class));
        }
        return res;
    }
    
    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> listCategory = categoryRepository.findAll();
        List<CategoryDto> res = new ArrayList<CategoryDto>();
        ModelMapper m = new ModelMapper();
        for(Category c : listCategory) {
            res.add(m.map(c, CategoryDto.class));
        }
        return res;
    }

    @Override
    public CustomerDto findAllByMailAndPassword(String mail, String password) {
        Customer res = customerRepository.findAllByMailAndPassword(mail, password);
        ModelMapper m = new ModelMapper();
        return m.map(res, CustomerDto.class);
    }

    @Override
    public void deleteByMail(CustomerDto cDto) {
        Customer res = customerRepository.findByMail(cDto.getMail());
        customerRepository.deleteById(res.getCustomerId());
        
    }

}
