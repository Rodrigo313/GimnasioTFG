/**
 * 
 */
package com.example.demo.models.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.IUsuarioService;

/**
 * @author rodri
 * @author santi
 *
 */
@Controller
public class PerfilController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/perfil")
	public String perfil(Authentication auth, Model model){
		String username = auth.getName();
		Usuario usuario = usuarioService.findByUsername(username);
		model.addAttribute("id", usuario.getId());
		return "perfil";
	}
	
	@PostMapping("/perfil")
	public String vistaPerfil() {
		return "redirect:/perfil";
	}
	
	@GetMapping("/removeusuario")
	public String removeUsuario(@RequestParam(name="id", required=true) int id) {
		usuarioService.removeUsuarios(id);
		return "redirect:/auth/registro";
	}
	
	@GetMapping("/modusuario")
	public String modUsuario(Model model, @RequestParam(name="id", required=true) int id) {
		Usuario u = new Usuario();
		if(id!=0) {
			u = usuarioService.findUsuariosById(id);
		}
		
		model.addAttribute("usuario", u);
		return "registro";
	}
	
}
