package fr.dawan.discountomatic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	@Query(value = "FROM Article a WHERE a.name LIKE :search")
    List<Article> findAllByName(@Param("search") String searchName);
}
