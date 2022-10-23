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

import com.organicos.project.model.entity.TipoUsuario;
import com.organicos.project.model.service.TipoUsuarioService;

@RestController
//http:localhost:8081/api/tipoUsuario
@RequestMapping("/api/tipoUsuario")
public class TipoUsuarioController {
	
	@Autowired
	private TipoUsuarioService tipoUsuarioService;
	
	@GetMapping("/{id}")
	public Optional<TipoUsuario> findById(@PathVariable Integer id){
		return tipoUsuarioService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<TipoUsuario> findAll(){
		return tipoUsuarioService.findAll();
	}
	
	@PostMapping
	public TipoUsuario save(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioService.save(tipoUsuario);
	}
	
	@PutMapping("/editar/{id}")
	public TipoUsuario update(@RequestBody TipoUsuario tipoUsuario,@PathVariable Integer id) {
		TipoUsuario tubd = tipoUsuarioService.findById(id).get();
		
		tubd.setNombreTipo(tipoUsuario.getNombreTipo());
		
		return tipoUsuarioService.save(tubd);
			
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		
		tipoUsuarioService.delete(id);
		
	}
	
	@GetMapping("/buscar/{nombre}/{id}")
	public List<TipoUsuario> consultarTipoUsuario(@PathVariable String nombreTipo,@PathVariable Integer idTipoUsuario){
		
		return tipoUsuarioService.consultarTipoUsuario(nombreTipo, idTipoUsuario);
		
	}

}
