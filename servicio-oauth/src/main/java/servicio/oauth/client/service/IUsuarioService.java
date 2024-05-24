package servicio.oauth.client.service;

import servicio.commons.usuarios.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario obtenerPorusername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
