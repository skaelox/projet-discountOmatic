package fr.dawan.discountomatic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.discountomatic.beans.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
