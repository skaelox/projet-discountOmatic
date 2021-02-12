package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
