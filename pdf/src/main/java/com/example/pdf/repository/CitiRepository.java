package com.example.pdf.repository;

import com.example.pdf.models.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiRepository extends CrudRepository<City, Long>{
    
}