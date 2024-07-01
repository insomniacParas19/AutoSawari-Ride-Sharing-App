package com.autosawari.springboot.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bookings_tbl")
public class BookingForm {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String fullname;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate bookDate;
	
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime bookTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="destId")
	private Destination fromDestination;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="destId")
	@PrimaryKeyJoinColumn
	private Destination toDestination;
	
	private int passengerCount;
	
	private String message;
	
	
	
	
}
