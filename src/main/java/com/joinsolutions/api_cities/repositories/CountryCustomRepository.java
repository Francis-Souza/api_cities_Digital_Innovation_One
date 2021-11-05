package com.joinsolutions.api_cities.repositories;

/*
 * Classe com implementação personalizada 
 * Busca por Id e nome 
 */

import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import com.joinsolutions.api_cities.entities.Country;

@Repository
public class CountryCustomRepository {

	private final EntityManager em;

	public CountryCustomRepository(EntityManager em) {		
		this.em = em;
	}
	
	public List<Country> findCustomImpl(Long id, String nome){			
		
		String query = "select c from Country c ";
		String condicao = "where ";
		
		if (id!= null) {
			query += condicao + "c.id = :id";
			condicao = " and";
		}
		if (nome!= null) {
			query += condicao + "c.name = :nome";
			condicao = " and";
			
		}		
		
		var q = em.createQuery(query, Country.class);
		
		
		if (id!= null) {
			q.setParameter("id", id);
		}
		if (nome!= null) {
			q.setParameter("nome", nome);
		}
		
		return q.getResultList();
	};
	
	
	
}
