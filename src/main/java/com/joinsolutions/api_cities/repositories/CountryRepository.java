package com.joinsolutions.api_cities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joinsolutions.api_cities.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	Optional<Country> findByName(String name);


}
