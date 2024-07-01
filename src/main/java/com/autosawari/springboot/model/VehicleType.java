package com.autosawari.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="vehicleType_tbl")
public class VehicleType {
	@Id
	@GeneratedValue
	private int id;
	private String modelType;
	private String fuelSource;

}
