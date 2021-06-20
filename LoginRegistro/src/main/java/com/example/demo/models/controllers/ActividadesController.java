/**
 * 
 */
package com.example.demo.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author rodri
 * @author santi
 *
 */

@Controller
public class ActividadesController {
	@GetMapping("/actividades")
	public String actividades(){
		return "actividades";
	}
	
	@PostMapping("/actividades")
	public String vistaActividades() {
		return "redirect:/actividades";
	}
}
