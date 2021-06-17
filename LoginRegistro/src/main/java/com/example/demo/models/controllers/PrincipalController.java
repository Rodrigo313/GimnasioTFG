/**
 * 
 */
package com.example.demo.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author rodri
 *
 */

@Controller
public class PrincipalController {
	
	@GetMapping("/principal")
	public String principal(){
		return "principal";
	}
	
	@PostMapping("/principal")
	public String vistaPrincipal() {
		return "redirect:/principal";
	}
	
}
