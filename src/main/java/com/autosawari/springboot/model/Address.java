package com.autosawari.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="address_tbl")
public class Address {
	@Id
	@GeneratedValue
	private Long id;
	private String country;
	private String district;
	private String city;
	private String villageMuncipality ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getVillageMuncipality() {
		return villageMuncipality;
	}
	public void setVillageMuncipality(String villageMuncipality) {
		this.villageMuncipality = villageMuncipality;
	}
	
	
}
