package com.joinsolutions.api_cities.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.joinsolutions.api_cities.entities.City;
import com.joinsolutions.api_cities.repositories.CityCustomRepositoryImpl;
import com.joinsolutions.api_cities.repositories.CityRepository;
import com.joinsolutions.api_cities.services.exceptions.ResourceNotFoundException;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private CityCustomRepositoryImpl cityCustomRepositoryImpl;

	public List<City> findAll() {
		return cityRepository.findAll();
	}

	public List<City> findByName(String name) {
		return cityRepository.findByNameContains(name);
	}

	public City findById(Long id) {
		Optional<City> obj = cityRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	/*
	 * Metódo com implementação personalizado de busca 
	 * por Id e nome * 
	 */
	public List<City> findByCustomImpl(Long id, String name) {	
		 return cityCustomRepositoryImpl.findCustomImpl(id, name);
	}
	
	/*
	 * Metódo com implementação utilizando Example do JPA
	 * Busca por Id e Nome 
	 */
	public List<City> findByCustom(Long id, String name) {
		City sample = new City();
		sample.setId(id);
		sample.setName(name);
		return cityRepository.findAll(Example.of(sample));
	}

}
