package com.organicos.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.organicos.project.model.entity.TipoUsuario;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
	
	@Query("select T from TipoUsuario T where T.nombreTipo = ?1 or T.idTipoUsuario = ?2")
	public List<TipoUsuario> consultarTipoUsuario(String nombreTipo,Integer idTipoUsuario);

}
