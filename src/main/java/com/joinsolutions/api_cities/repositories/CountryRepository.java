package com.joinsolutions.api_cities.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joinsolutions.api_cities.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	List<Country>findByNameContains(String name);

}
