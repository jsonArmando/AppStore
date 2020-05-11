package com.app.spring.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleados")
public class Empleados implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nombres;
	@Column(nullable = false)
	private String apellidos;
	@Column(nullable = false)
	private long numeroIdentificacion;
	@Column(nullable = false)
	private long tipoIdentificacion;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	
}