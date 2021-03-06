package com.app.spring.models.services;

import java.util.List;

import com.app.spring.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
}
