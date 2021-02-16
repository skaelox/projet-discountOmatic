package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    @Query(value = "FROM Customer a WHERE a.mail LIKE :searchMail AND a.password LIKE :searchPwd")
    Customer findAllByMailAndPassword(@Param("searchMail") String searchMail, @Param("searchPwd") String searchPwd);
    
    @Query(value = "FROM Customer a WHERE a.mail LIKE :searchMail")
    Customer findByMail(@Param("searchMail") String searchMail);

}