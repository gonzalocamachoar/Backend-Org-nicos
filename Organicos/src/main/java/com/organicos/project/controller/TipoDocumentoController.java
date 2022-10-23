package com.organicos.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organicos.project.model.entity.TipoDocumento;
import com.organicos.project.model.service.TipoDocumentoService;

@RestController
@RequestMapping("/api/tipoDocumento")
public class TipoDocumentoController {
	
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping("/{id}")
	public Optional<TipoDocumento> findById(@PathVariable Integer id){
		
		return tipoDocumentoService.findById(id);
		
	}
	
	@GetMapping("/listar")
	public List<TipoDocumento> findAll(){
		
		return tipoDocumentoService.findAll();
		
	}
	
	@PostMapping
	public TipoDocumento save(@RequestBody TipoDocumento tipoDocumento) {
		
		return tipoDocumentoService.save(tipoDocumento);
		
	}
	
	@PutMapping("/editar/{id}")
	public TipoDocumento editar(@RequestBody TipoDocumento tipoDocumento, @PathVariable Integer id) {
		TipoDocumento tdBD = tipoDocumentoService.findById(id).get();
		
		tdBD.setNombreTipoDoc(tipoDocumento.getNombreTipoDoc());
		
		return tipoDocumentoService.save(tdBD);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		
		tipoDocumentoService.delete(id);
		
	}
	
}
