package com.autosawari.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DestinationController {

	@GetMapping({"/destinations"})
	private String getDestination() {
		
		
		return "Destination";
	}
}
