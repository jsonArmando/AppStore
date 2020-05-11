package com.app.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.spring.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
