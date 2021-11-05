package com.joinsolutions.api_cities.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joinsolutions.api_cities.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

	Optional<State> findByName(String name);	

}
