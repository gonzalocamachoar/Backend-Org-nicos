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

import com.organicos.project.model.entity.Usuario;
import com.organicos.project.model.service.UsuarioService;

@RestController
@RequestMapping("/api/user")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/{id}")
	public Optional<Usuario> findById(@PathVariable Integer id){
		
		return usuarioService.findById(id);
				
	}
	
	@GetMapping("/listar")
	public List<Usuario> findAll(){
		
		return usuarioService.findAll();
		
	}
	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		
		return usuarioService.save(usuario);
		
	}
	
	@PutMapping("/editar/{id}")
	public Usuario save(@RequestBody Usuario usuario, @PathVariable Integer id) {
		Usuario userbd = usuarioService.findById(id).get();
		
		userbd.setNombreU(usuario.getNombreU());
		userbd.setApellidoU(usuario.getApellidoU());
		userbd.setIdTipoDoc(usuario.getIdTipoDoc());
		userbd.setDocumentoU(usuario.getDocumentoU());
		userbd.setTelefonoU(usuario.getTelefonoU());
		userbd.setDireccionU(usuario.getDireccionU());
		userbd.setEmailU(usuario.getEmailU());
		userbd.setContraseñaU(usuario.getContraseñaU());
		userbd.setIdTipoUser(usuario.getIdTipoUser());
		userbd.setEstadoU(usuario.getEstadoU());
		
		return usuarioService.save(userbd);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		
		usuarioService.deleteById(id);
		
	}
	
}
