package com.joinsolutions.api_cities.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joinsolutions.api_cities.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

	List<City> findByNameContains(String name);	

}
