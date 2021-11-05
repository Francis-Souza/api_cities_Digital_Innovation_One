package com.joinsolutions.api_cities.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.joinsolutions.api_cities.entities.Country;
import com.joinsolutions.api_cities.repositories.CountryCustomRepository;
import com.joinsolutions.api_cities.repositories.CountryRepository;
import com.joinsolutions.api_cities.services.exceptions.ResourceNotFoundException;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private CountryCustomRepository countryCustomRepository;

	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	public List<Country> findByName(String name) {
		return countryRepository.findByNameContains(name);
	}

	public Country findById(Long id) {
		Optional<Country> obj = countryRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	/*
	 * Metódo com implementação personalizado de busca 
	 * por Id e nome * 
	 */
	public List<Country> findByCustomImpl(Long id, String name) {	
		 return countryCustomRepository.findCustomImpl(id, name);
	}
	
	/*
	 * Metódo com implementação utilizando Example do JPA
	 * Busca por Id e Nome 
	 */
	public List<Country> findByCustom(Long id, String name) {
		Country sample = new Country();
		sample.setName(name);
		sample.setId(id);
		return countryRepository.findAll(Example.of(sample));
	}

}
