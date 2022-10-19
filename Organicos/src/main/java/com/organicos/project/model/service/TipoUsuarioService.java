package com.organicos.project.model.service;

import java.util.List;
import java.util.Optional;

import com.organicos.project.model.entity.TipoUsuario;

public interface TipoUsuarioService {
	
	public Optional<TipoUsuario> findById(Integer id);
	
	public List<TipoUsuario> findAll();
	
	public TipoUsuario save(TipoUsuario tipoUsuario);
	
	public void delete(Integer id);
	
	public List<TipoUsuario> consultarTipoUsuario(String nombreTipo,Integer idTipoUsuario);

}
