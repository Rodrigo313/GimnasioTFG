/**
 * 
 */
package com.example.demo.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rodri
 *
 */

@Controller
@RequestMapping("/public")
public class PublicController {
	
	@GetMapping("/index")
	public String index() {
		return "logout";
	}
}
