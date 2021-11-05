package com.joinsolutions.api_cities.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joinsolutions.api_cities.entities.State;
import com.joinsolutions.api_cities.services.StateService;

@RestController
@RequestMapping("/states")
public class StateResource {

	@Autowired
	private StateService stateService;

	@GetMapping
	public ResponseEntity<List<State>> finAll() {
		List<State> list = stateService.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<State> findById(@PathVariable Long id) {

		State obj = stateService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/nameState/{name}")
	public ResponseEntity<?> getState(@PathVariable String name) {
		Optional<?> state = stateService.findByName(name);
		if (!state.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(state);
	}
	

}
