package com.app.spring.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.spring.models.entity.Empleados;

public interface IEmpleadosDao extends CrudRepository<Empleados, Long> {

}
