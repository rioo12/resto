package com.apollo.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apollo.resto.model.tablepax;

@Repository
public interface tablepaxRepository 
extends JpaRepository<tablepax, Integer>{
    
}
