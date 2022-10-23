package com.organicos.project.model.service;

import java.util.List;
import java.util.Optional;

import com.organicos.project.model.entity.Usuario;

public interface UsuarioService {
	
	public Optional<Usuario> findById(Integer id);
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(Integer id);

}
