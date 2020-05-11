package com.app.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.spring.models.dao.IClientesDao;
import com.app.spring.models.entity.Clientes;

@Service
public class ClientesServiceImpl implements IClientesService {
	@Autowired
	private IClientesDao clientesDao;
	@Override
	@Transactional(readOnly = true)
	public List<Clientes> findAll() {
		return (List<Clientes>) clientesDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Clientes finndById(Long id) {
		return clientesDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Clientes save(Clientes clientes) {
		return clientesDao.save(clientes);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		clientesDao.deleteById(id);
	}
}



