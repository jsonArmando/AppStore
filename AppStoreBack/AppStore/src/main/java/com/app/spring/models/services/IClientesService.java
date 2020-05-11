package com.app.spring.models.services;

import java.util.List;

import com.app.spring.models.entity.Clientes;

public interface IClientesService {
	public List<Clientes> findAll();
	public Clientes finndById(Long id);
	public Clientes save(Clientes clientes);
	public void delete(Long id);
}
