package com.joinsolutions.api_cities.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estado")
public class State implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	@NotNull
	private String name;	
	
	@NotNull
	private String uf;
	
	@Column(name = "ibge")
	@NotNull
	private Integer codIbge;
	
	@ManyToOne
	@JoinColumn(name = "pais")
	private Country country;
	
	
	@Column(name = "ddd")
	@NotNull
	private String ddi;

	public State() {
		
	}
	
	
	public State(Long id, @NotNull String name, @NotNull String uf, @NotNull Integer codIbge, Country country,
			@NotNull String ddi) {
		
		this.id = id;
		this.name = name;
		this.uf = uf;
		this.codIbge = codIbge;
		this.country = country;
		this.ddi = ddi;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Integer getCodIbge() {
		return codIbge;
	}


	public void setCodIbge(Integer codIbge) {
		this.codIbge = codIbge;
	}


	public Country getCountry() {
		return country;
	}
	

	public void setCountry(Country country) {
		this.country = country;
	}


	public String getDdi() {
		return ddi;
	}


	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	

}
