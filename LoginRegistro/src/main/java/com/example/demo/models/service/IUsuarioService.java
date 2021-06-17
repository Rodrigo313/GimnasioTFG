/**
 * 
 */
package com.example.demo.models.service;

import com.example.demo.models.entity.Usuario;

/**
 * @author rodri
 *
 */
public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario registrar(Usuario u);
}
