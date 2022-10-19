package com.organicos.project.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organicos.project.model.entity.TipoUsuario;
import com.organicos.project.repository.TipoUsuarioRepository;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {
	
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;

	@Override
	public Optional<TipoUsuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoUsuarioRepository.findById(id);
	}

	@Override
	public List<TipoUsuario> findAll() {
		// TODO Auto-generated method stub
		return tipoUsuarioRepository.findAll();
	}

	@Override
	public TipoUsuario save(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		return tipoUsuarioRepository.save(tipoUsuario);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		tipoUsuarioRepository.deleteById(id);
		
	}

	@Override
	public List<TipoUsuario> consultarTipoUsuario(String nombreTipo, Integer idTipoUsuario) {
		// TODO Auto-generated method stub
		return tipoUsuarioRepository.consultarTipoUsuario(nombreTipo, idTipoUsuario);
	}



}
