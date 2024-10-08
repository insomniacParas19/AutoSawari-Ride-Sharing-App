package com.autosawari.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="destination_tbl")
public class Destination {
	@Id
	@GeneratedValue
	private Long id;
	private String distName;
	
}
