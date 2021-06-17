/**
 * 
 */
package com.example.demo.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author rodri
 *
 */

@Controller

public class InicioController {
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}

}
