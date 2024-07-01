package com.autosawari.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="driver_tbl")
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String fullName;
	private String licenseNo;
	@OneToOne
	@JoinColumn(name="vehicleId")
	private Vehicle vehicleOwned;
	private String contactNo;
	private String password;
	
	

}
