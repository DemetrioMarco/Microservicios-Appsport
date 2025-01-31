package servicio.usuarios.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import servicio.commons.usuarios.entity.Usuario;
import servicio.usuarios.models.dao.UsuarioDao;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		
		Usuario user = new Usuario();
		user = usuario;
		user.setPassword(passwordEncoder.encode(usuario.getPassword()));
		
		return usuarioDao.save(user);
	}

}
