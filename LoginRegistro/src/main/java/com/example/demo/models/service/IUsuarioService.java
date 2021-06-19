/**
 * 
 */
package com.example.demo.models.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.repository.IUsuarioRepository;

/**
 * @author rodri
 *
 */
public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario registrar(Usuario u);
	public Usuario findUsuariosById(long id);
	public void removeUsuarios(long id);
	public Usuario addUsuario(Usuario usuario);
}
