package com.app.spring.models.services;

import java.util.List;

import com.app.spring.models.entity.Factura;

public interface IFacturaService {
	public List<Factura> findaAll();
	public Factura findById(Long id);
	public Factura save(Factura factura);
	public void delete(Long id);

}


