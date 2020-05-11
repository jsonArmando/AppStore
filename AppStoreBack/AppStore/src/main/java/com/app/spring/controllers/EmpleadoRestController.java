package com.app.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.models.entity.Empleados;
import com.app.spring.models.services.IEmpleadosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class EmpleadoRestController {
	@Autowired
	private IEmpleadosService empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleados> index(){
		return empleadoService.findall();
	}
	@GetMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empleados showId(@PathVariable Long id) {
		return empleadoService.findById(id);
	}
	@PostMapping("/empleados")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleados createEmpleado(@RequestBody Empleados empleados) {
		return empleadoService.save(empleados);
	}
	@PutMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleados updateEmpleados(@RequestBody Empleados empleados,@PathVariable Long id) {
	Empleados empleadosActual = empleadoService.findById(id);
	
	empleadosActual.setApellidos(empleados.getApellidos());
	empleadosActual.setNombres(empleados.getNombres());
	empleadosActual.setNumeroIdentificacion(empleados.getNumeroIdentificacion());
	empleadosActual.setTipoIdentificacion(empleados.getTipoIdentificacion());
	return empleadoService.save(empleados);
	}
	@DeleteMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
	empleadoService.delete(id);
	}		
}

