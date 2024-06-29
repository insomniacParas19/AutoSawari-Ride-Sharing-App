package com.autosawari.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingFormController {

	@GetMapping({"/booking"})
	private String getBookingForm() {
		
		return "BookingForm";
	}
}
