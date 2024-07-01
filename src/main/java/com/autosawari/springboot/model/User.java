package com.autosawari.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_tbl")
public class User {

	@Id //PK
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Auto increment
	private int id;
	private String fullname;
	@Column(unique=true)
	private String username;
	
	private String password;
	
	private String role;
		
}
