package com.app.spring.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
public class Clientes implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = true)
	private long numeroIdentificacion;
	@Column(nullable = true)
	private long tipoIdentificacion;
	@Column(nullable = false)
	private String nombreCliente;
	@Column(nullable = false)
	private String apellidoCliente;
	@Column(nullable = false)
	private String domicilioCliente;
	@Column(nullable = false)
	private long telefonoCliente;
	@Column(nullable = false)
	private String correo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public long getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(long tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDomicilioCliente() {
		return domicilioCliente;
	}
	public void setDomicilioCliente(String domicilioCliente) {
		this.domicilioCliente = domicilioCliente;
	}
	public long getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(long telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
