package com.organicos.project.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario")
	private Integer idUsuario;
	@Column(name = "nombre")
	private String nombreU;
	@Column(name = "apellido")
	private String apellidoU;
	@Column(name = "tipo_documento")
	private Integer idTipoDoc;
	@Column(name = "documento")
	private Integer documentoU;
	@Column(name = "telefono")
	private String telefonoU;
	@Column(name = "direccion")
	private String direccionU;
	@Column(name = "email")
	private String emailU;
	@Column(name = "contraseña")
	private String contraseñaU;
	@Column(name = "tipo_usuario")
	private Integer idTipoUser;
	@Column(name = "estado")
	private String estadoU;
	
	public Usuario(String emailU, String contraseñaU) {
		this.emailU = emailU;
		this.contraseñaU = contraseñaU;
	}
	public Usuario() {

	}
	public Usuario(Integer idUsuario, String nombreU, String apellidoU, Integer idTipoDoc, Integer documentoU,
			String telefonoU, String direccionU, String emailU, String contraseñaU, Integer idTipoUser,
			String estadoU) {
		this.idUsuario = idUsuario;
		this.nombreU = nombreU;
		this.apellidoU = apellidoU;
		this.idTipoDoc = idTipoDoc;
		this.documentoU = documentoU;
		this.telefonoU = telefonoU;
		this.direccionU = direccionU;
		this.emailU = emailU;
		this.contraseñaU = contraseñaU;
		this.idTipoUser = idTipoUser;
		this.estadoU = estadoU;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreU=" + nombreU + ", apellidoU=" + apellidoU + ", idTipoDoc="
				+ idTipoDoc + ", documentoU=" + documentoU + ", telefonoU=" + telefonoU + ", direccionU=" + direccionU
				+ ", emailU=" + emailU + ", contraseñaU=" + contraseñaU + ", idTipoUser=" + idTipoUser + ", estadoU="
				+ estadoU + "]";
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreU() {
		return nombreU;
	}
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	public String getApellidoU() {
		return apellidoU;
	}
	public void setApellidoU(String apellidoU) {
		this.apellidoU = apellidoU;
	}
	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}
	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}
	public Integer getDocumentoU() {
		return documentoU;
	}
	public void setDocumentoU(Integer documentoU) {
		this.documentoU = documentoU;
	}
	public String getTelefonoU() {
		return telefonoU;
	}
	public void setTelefonoU(String telefonoU) {
		this.telefonoU = telefonoU;
	}
	public String getDireccionU() {
		return direccionU;
	}
	public void setDireccionU(String direccionU) {
		this.direccionU = direccionU;
	}
	public String getEmailU() {
		return emailU;
	}
	public void setEmailU(String emailU) {
		this.emailU = emailU;
	}
	public String getContraseñaU() {
		return contraseñaU;
	}
	public void setContraseñaU(String contraseñaU) {
		this.contraseñaU = contraseñaU;
	}
	public Integer getIdTipoUser() {
		return idTipoUser;
	}
	public void setIdTipoUser(Integer idTipoUser) {
		this.idTipoUser = idTipoUser;
	}
	public String getEstadoU() {
		return estadoU;
	}
	public void setEstadoU(String estadoU) {
		this.estadoU = estadoU;
	}

}
