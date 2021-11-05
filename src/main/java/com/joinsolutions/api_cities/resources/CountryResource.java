package com.joinsolutions.api_cities.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joinsolutions.api_cities.entities.Country;
import com.joinsolutions.api_cities.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	@Autowired
	private CountryService countryService;

	@GetMapping
	public ResponseEntity<List<Country>> finAll() {
		List<Country> list = countryService.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Country> findById(@PathVariable Long id) {

		Country obj = countryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping("/namePais/{name}")
	public ResponseEntity<?> getCountry(@PathVariable String name) {
		Optional<?> country = countryService.findByName(name);
		if (!country.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(country);
	}

}
