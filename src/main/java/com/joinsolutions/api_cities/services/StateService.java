package com.joinsolutions.api_cities.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.joinsolutions.api_cities.entities.State;
import com.joinsolutions.api_cities.repositories.StateRepository;
import com.joinsolutions.api_cities.services.exceptions.ResourceNotFoundException;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	public List<State> findAll() {
		return stateRepository.findAll();
	}

	public List<State> findByName(String name) {
		return stateRepository.findByNameContains(name);
	}

	public State findById(Long id) {
		Optional<State> obj = stateRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public List<State> findByCustom(Long id, String name) {

		State sample = new State();
		sample.setId(id);
		sample.setName(name);

		return stateRepository.findAll(Example.of(sample));

	}

}
