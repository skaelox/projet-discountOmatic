package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.discountomatic.beans.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long>{
    
}
