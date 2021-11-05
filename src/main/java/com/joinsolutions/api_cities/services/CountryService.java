package com.joinsolutions.api_cities.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joinsolutions.api_cities.entities.Country;
import com.joinsolutions.api_cities.repositories.CountryRepository;
import com.joinsolutions.api_cities.services.exceptions.ResourceNotFoundException;

@Service
public class CountryService {
	
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> findAll(){
		return countryRepository.findAll(); 
	}
	
	public Optional<Country> findByName(String name) {
        return Optional.of(countryRepository.findByName(name).orElseThrow(()-> new ResourceNotFoundException(name)));
    }

	
	public Country findById(Long id) {		
		Optional<Country> obj = countryRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));		
	}



}
