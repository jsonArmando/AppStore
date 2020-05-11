package com.app.spring.models.services;

import java.util.List;
import com.app.spring.models.entity.Empleados;

public interface IEmpleadosService {
	public List<Empleados> findall();
	public Empleados findById(Long id);
	public Empleados save(Empleados empleados);
	public void delete(Long id);
}
