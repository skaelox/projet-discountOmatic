package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

	@Query(value = "FROM Supplier sup WHERE sup.firstName LIKE :search")
    Supplier findSupplierByfirstName(@Param("search") String searchName);
	
	@Query(value = "FROM Supplier sup WHERE sup.mail LIKE :searchMail AND sup.password LIKE :searchPwd")
	Supplier findAllByMailAndPassword(@Param("searchMail") String searchMail, @Param("searchPwd") String searchPwd);
}

