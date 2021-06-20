/**
 * 
 */
package com.example.demo.models.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entity.Usuario;

/**
 * @author rodri
 * @author santi
 *
 */
public interface IUsuarioRepository extends JpaRepository<Usuario, Serializable> {
	
	public Usuario findById(long id);

}
