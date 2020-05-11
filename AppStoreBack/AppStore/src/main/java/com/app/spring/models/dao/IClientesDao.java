package com.app.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.spring.models.entity.Clientes;

public interface IClientesDao extends CrudRepository<Clientes, Long>{

}
