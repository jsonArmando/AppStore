package com.app.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.spring.models.dao.IProductoDao;
import com.app.spring.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	@Autowired
	private IProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		productoDao.deleteById(id);
	}

}
