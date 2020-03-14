package com.tvf.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvf.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//query methods
	//Optional<Usuario> findByEmail(String email);

	boolean existsByEmail(String email);
}
