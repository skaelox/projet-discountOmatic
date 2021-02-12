package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}