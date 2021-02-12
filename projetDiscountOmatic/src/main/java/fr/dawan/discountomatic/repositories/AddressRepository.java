package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
