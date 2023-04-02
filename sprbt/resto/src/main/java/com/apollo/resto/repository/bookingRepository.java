package com.apollo.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apollo.resto.model.bookingrecord;

@Repository
public interface bookingRepository
extends JpaRepository<bookingrecord, Integer> {
    
}

