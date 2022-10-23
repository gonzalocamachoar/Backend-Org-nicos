package com.organicos.project.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {
	
	@Id
	@Column(name = "idtipo_documento")
	private Integer idTipoDoc;
	@Column(name = "nombre")
	private String nombreTipoDoc;
	
	
	
	public TipoDocumento() {
	}



	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}



	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}



	public String getNombreTipoDoc() {
		return nombreTipoDoc;
	}



	public void setNombreTipoDoc(String nombreTipoDoc) {
		this.nombreTipoDoc = nombreTipoDoc;
	}



	public TipoDocumento(Integer idTipoDoc, String nombreTipoDoc) {
		this.idTipoDoc = idTipoDoc;
		this.nombreTipoDoc = nombreTipoDoc;
	}



	@Override
	public String toString() {
		return "TipoDocumento [idTipoDoc=" + idTipoDoc + ", nombreTipoDoc=" + nombreTipoDoc + "]";
	}
	
	

}
