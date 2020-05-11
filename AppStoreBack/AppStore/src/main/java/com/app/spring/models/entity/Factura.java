package com.app.spring.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Factura")
public class Factura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String codigoProducto;
	private String nombreProducto;
	private String descripcionProducto;
	@Column(nullable = false)
	private float precioPreventa;
	@Column(nullable = false)
	private float precioVenta;
	@Column(nullable = false)
	private long cantidadProducto;
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	@Column(nullable = true)
	private String sede;
	@Column(nullable = false)
	private float valor;
	
	@PrePersist
	public void prePersist() {
		fechaRegistro = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public float getPrecioPreventa() {
		return precioPreventa;
	}
	public void setPrecioPreventa(float precioPreventa) {
		this.precioPreventa = precioPreventa;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public long getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(long cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}

