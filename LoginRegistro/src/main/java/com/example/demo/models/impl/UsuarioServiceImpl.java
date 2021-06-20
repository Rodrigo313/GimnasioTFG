/**
 * 
 */
package com.example.demo.models.impl;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IUsuarioDAO;
import com.example.demo.models.entity.Usuario;
import com.example.demo.models.repository.IUsuarioRepository;
import com.example.demo.models.service.IUsuarioService;

/**
 * @author rodri
 * @author santi
 *
 */

@Service("usuarioservice")
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private IUsuarioDAO usuarioDao;

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	public Usuario registrar(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
	}

	@Override
	public Usuario findUsuariosById(long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public void removeUsuarios(long id) {
		Usuario u = findUsuariosById(id);
		
		if(null != u) {
			usuarioRepository.delete(u);
		
	}
}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
