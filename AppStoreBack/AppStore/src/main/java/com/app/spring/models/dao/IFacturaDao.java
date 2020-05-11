package com.app.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.spring.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
