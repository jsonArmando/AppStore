package com.app.spring.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.spring.models.dao.IEmpleadosDao;
import com.app.spring.models.entity.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService {
	@Autowired
	private IEmpleadosDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findall() {
		return (List<Empleados>) empleadoDao.findAll();
	}

	@Override
	public Empleados findById(Long id) {
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleados save(Empleados empleados) {
		return empleadoDao.save(empleados);
	}

	@Override
	public void delete(Long id) {
		empleadoDao.findById(id);
	}
}
