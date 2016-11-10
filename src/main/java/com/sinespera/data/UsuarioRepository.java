package hello.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository  extends CrudRepository<Usuario, String> {

	List<Usuario> findByNombre(String nombre);
	
	Usuario findByUsuario(String usuario);
 
}
