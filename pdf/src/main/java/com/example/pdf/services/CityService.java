package com.example.pdf.services;
import java.util.List;
import com.example.pdf.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pdf.repository.CitiRepository;
@Service
public class CityService implements ICityService{
    
    @Autowired
    private CitiRepository repository;

    @Override
    public List<City> findAll() {

        return (List<City>) repository.findAll();
    }
}