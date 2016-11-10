package com.sinespera.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sinespera.model.Usuario;

public interface UsuarioRepository  extends CrudRepository<Usuario, String> {

	List<Usuario> findByNombre(String nombre);
	
	Usuario findByUsuario(String usuario);
	
 
}
