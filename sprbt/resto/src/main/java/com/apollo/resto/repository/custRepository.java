package com.apollo.resto.repository;
import com.apollo.resto.model.customer;
import org.springframework.stereotype.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface custRepository extends JpaRepository<customer, Integer> {

    
    
} 




