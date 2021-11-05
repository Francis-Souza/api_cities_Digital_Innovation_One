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
@Table(name = "cidade")
public class City implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	@NotNull
	private String name;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "uf")
	private State state;
	
	@Column(name = "ibge")
	@NotNull
	private Integer codIbge;
	
	@NotNull
	private String lat_lon;
	
	@NotNull
	private Double latitude;

	@NotNull
	private Double longitude;
	
	@NotNull
	private Integer cod_tom;
	
	public City() {
		
	}

	public City(Long id, @NotNull String name, @NotNull State state, @NotNull Integer codIbge, @NotNull String lat_lon,
			@NotNull Double latitude, @NotNull Double longitude, @NotNull Integer cod_tom) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.codIbge = codIbge;
		this.lat_lon = lat_lon;
		this.latitude = latitude;
		this.longitude = longitude;
		this.cod_tom = cod_tom;
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Integer getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(Integer codIbge) {
		this.codIbge = codIbge;
	}

	public String getLat_lon() {
		return lat_lon;
	}

	public void setLat_long(String lat_lon) {
		this.lat_lon = lat_lon;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getCod_tom() {
		return cod_tom;
	}

	public void setCod_tom(Integer cod_tom) {
		this.cod_tom = cod_tom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
