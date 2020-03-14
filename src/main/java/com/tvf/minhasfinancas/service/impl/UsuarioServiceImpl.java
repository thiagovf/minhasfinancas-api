package com.tvf.minhasfinancas.service.impl;

import org.springframework.stereotype.Service;

import com.tvf.minhasfinancas.exception.RegraNegocioException;
import com.tvf.minhasfinancas.model.entity.Usuario;
import com.tvf.minhasfinancas.model.repository.UsuarioRepository;
import com.tvf.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository repository;
	
//	@Autowired
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe usuário com esse e-mail.");
		}
	}

}
