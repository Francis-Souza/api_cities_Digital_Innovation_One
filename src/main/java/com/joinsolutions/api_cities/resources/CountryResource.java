package com.joinsolutions.api_cities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joinsolutions.api_cities.entities.Country;
import com.joinsolutions.api_cities.services.CountryService;

@RestController
@RequestMapping("/")
public class CountryResource {

	@Autowired
	private CountryService countryService;

	@GetMapping("/api/v1/countries")
	public ResponseEntity<List<Country>> finAll() {
		List<Country> list = countryService.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/api/v1/countries/{id}")
	public ResponseEntity<Country> findById(@PathVariable Long id) {

		Country obj = countryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping("/api/v1/countries/filterLike/{name}")
	public ResponseEntity<List<Country>> findByName(@RequestParam("name") String name) {
		List<Country> obj = countryService.findByName(name);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Metódo com implementação personalizado de busca 
	 * por Id e nome * 
	 */
	@GetMapping("/api/v1/countries/filterCustomImpl/{name}")
	public ResponseEntity<List<Country>> findByCustomImpl(
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "nome", required = false) String nome) {

		List<Country> obj = countryService.findByCustomImpl(id, nome);
		return ResponseEntity.ok().body(obj);
	}
		
	/*
	 * Metódo com implementação utilizando Example do JPA
	 * Busca por Id e Nome 
	 */
	@GetMapping("/api/v1/countries/filterCustom/{name}")
	public ResponseEntity<List<Country>> findByCustom(
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "nome", required = false) String nome) {

		List<Country> obj = countryService.findByCustom(id, nome);
		return ResponseEntity.ok().body(obj);
	}


}
