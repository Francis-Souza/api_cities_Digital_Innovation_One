package com.joinsolutions.api_cities.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joinsolutions.api_cities.entities.City;
import com.joinsolutions.api_cities.services.CityService;

@RestController
@RequestMapping("/")
public class CityResource {

	@Autowired
	private CityService cityService;

	@GetMapping("/api/v1/cities")
	public ResponseEntity<List<City>> finAll() {
		List<City> list = cityService.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/api/v1/cities/{id}")
	public ResponseEntity<City> findById(@PathVariable Long id) {

		City obj = cityService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping("/api/v1/cities/filterLike/{name}")
	public ResponseEntity<List<City>> findByName(@RequestParam("name") String name) {
		List<City> obj = cityService.findByName(name);
		return ResponseEntity.ok().body(obj);
	}
	
	/*
	 * Metódo com implementação personalizado de busca 
	 * por Id e nome * 
	 */
	@GetMapping("/api/v1/cities/filterCustomImpl/{name}")
	public ResponseEntity<List<City>> findByCustomImpl(
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "nome", required = false) String nome) {

		List<City> obj = cityService.findByCustomImpl(id, nome);
		return ResponseEntity.ok().body(obj);
	}
		
	/*
	 * Metódo com implementação utilizando Example do JPA
	 * Busca por Id e Nome 
	 */
	@GetMapping("/api/v1/cities/filterCustom/{name}")
	public ResponseEntity<List<City>> findByCustom(
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "nome", required = false) String nome) {

		List<City> obj = cityService.findByCustom(id, nome);
		return ResponseEntity.ok().body(obj);
	}


}
