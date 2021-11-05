package com.joinsolutions.api_cities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joinsolutions.api_cities.entities.State;
import com.joinsolutions.api_cities.services.StateService;

@RestController
@RequestMapping("/")
public class StateResource {

	@Autowired
	private StateService stateService;

	@GetMapping("/api/v1/states")
	public ResponseEntity<List<State>> finAll() {
		List<State> list = stateService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/api/v1/states/{id}")
	public ResponseEntity<State> findById(@PathVariable Long id) {

		State obj = stateService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/api/v1/states/filter/{name}")
	public ResponseEntity<List<State>> findByName(@RequestParam String name) {
		List<State> state = stateService.findByName(name);
		return ResponseEntity.ok(state);
	}
	

}
