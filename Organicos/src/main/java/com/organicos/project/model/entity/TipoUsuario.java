package com.organicos.project.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
	
	@Id
	@Column(name = "idtipo_usuario")
	private Integer idTipoUsuario;
	@Column(name = "nombre")
	private String nombreTipo;
	
	public TipoUsuario(Integer idTipoUsuario, String nombreTipo) {
		this.idTipoUsuario = idTipoUsuario;
		this.nombreTipo = nombreTipo;
	}
	public TipoUsuario() {
	}
	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getNombreTipo() {
		return nombreTipo;
	}
	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}
	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + idTipoUsuario + ", nombreTipo=" + nombreTipo + "]";
	}
	
	

}
