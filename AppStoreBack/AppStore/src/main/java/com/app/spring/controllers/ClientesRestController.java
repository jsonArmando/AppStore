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

import com.app.spring.models.entity.Clientes;
import com.app.spring.models.services.IClientesService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class ClientesRestController {
	@Autowired
	private IClientesService clienteService;
	
	@GetMapping("/clientes")
	public List<Clientes> Index(){
		return clienteService.findAll();
	}
	@GetMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Clientes showId(@PathVariable Long id) {
		return clienteService.finndById(id);
	}
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes createCliente(@RequestBody Clientes clientes) {
		return clienteService.save(clientes);
	}
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes updateClientes(@RequestBody Clientes clientes,@PathVariable Long id) {
		Clientes clienteActual = clienteService.finndById(id);
		
		clienteActual.setApellidoCliente(clientes.getApellidoCliente());
		clienteActual.setCorreo(clientes.getCorreo());
		clienteActual.setDomicilioCliente(clientes.getDomicilioCliente());
		clienteActual.setNombreCliente(clientes.getNombreCliente());
		clienteActual.setNumeroIdentificacion(clientes.getNumeroIdentificacion());
		clienteActual.setTelefonoCliente(clienteActual.getTelefonoCliente());
		clienteActual.setTipoIdentificacion(clienteActual.getTipoIdentificacion());
		return clienteService.save(clienteActual);
	}
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
}
	