package com.organicos.project.model.service;

import java.util.List;
import java.util.Optional;

import com.organicos.project.model.entity.TipoDocumento;

public interface TipoDocumentoService {
	
	public Optional<TipoDocumento> findById(Integer id);
	
	public List<TipoDocumento> findAll();
	
	public TipoDocumento save(TipoDocumento tipoDocumento);
	
	public void delete(Integer id);

}
