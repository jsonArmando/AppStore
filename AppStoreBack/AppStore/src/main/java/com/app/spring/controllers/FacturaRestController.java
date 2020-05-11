package com.app.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.models.entity.Factura;
import com.app.spring.models.services.IFacturaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {
	@Autowired
	private IFacturaService facturaServicio;
	
	@PostMapping("/factura")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura crearFactura(@RequestBody Factura factura) {
		float venta = factura.getPrecioPreventa()*factura.getCantidadProducto();
		System.out.print(venta);
		factura.setValor(venta);
		return facturaServicio.save(factura);
	}
	
	@GetMapping("/factura")
	@ResponseStatus(HttpStatus.OK)
	public List<Factura> indexFactura(){
		return facturaServicio.findaAll();
		
	}

}
