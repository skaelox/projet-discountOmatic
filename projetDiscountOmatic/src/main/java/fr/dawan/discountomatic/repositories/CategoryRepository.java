package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.beans.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	@Query(value = "FROM Category c WHERE c.name LIKE :search")
    Category findCategoryByName(@Param("search") String searchName);
}
