package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	  
    @Query(value = "FROM Address ad WHERE ad.city LIKE :searchCity")
    Address findByCity(@Param("searchCity") String searchCity);
    
    
    @Query(value = "FROM Address ad WHERE ad.country LIKE :searchCountry")
    Address findByCountry(@Param("searchCountry") String searchCountry);
}
