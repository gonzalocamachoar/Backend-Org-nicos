package com.organicos.project.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organicos.project.model.entity.TipoDocumento;
import com.organicos.project.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Optional<TipoDocumento> findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoDocumentoRepository.findById(id);
	}

	@Override
	public List<TipoDocumento> findAll() {
		// TODO Auto-generated method stub
		return tipoDocumentoRepository.findAll();
	}

	@Override
	public TipoDocumento save(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		return tipoDocumentoRepository.save(tipoDocumento);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		tipoDocumentoRepository.deleteById(id);
	}

	

}
