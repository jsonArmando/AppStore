package com.app.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.spring.models.dao.IFacturaDao;
import com.app.spring.models.entity.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService{
	@Autowired
	private IFacturaDao facturaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Factura> findaAll() {
		return (List<Factura>) facturaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Factura findById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Factura save(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		facturaDao.deleteById(id);
	}
}

