package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	
}
