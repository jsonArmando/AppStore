package com.app.spring.controllers;

import java.util.Date;
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

import com.app.spring.models.entity.Producto;
import com.app.spring.models.services.IProductoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired
	private IProductoService productoServicio;
	
	@GetMapping("/productos")
	public List<Producto> index(){
		return productoServicio.findAll();
		
	}
	@GetMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Producto showId(@PathVariable Long id) {
		return productoServicio.findById(id);
	}
	
	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto createProducto(@RequestBody Producto producto) {
		//producto.setFechaRegistro(new Date());
		return productoServicio.save(producto);
	}
	@PutMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto updateProducto(@RequestBody Producto producto,@PathVariable Long id) {
		Producto productoActual = productoServicio.findById(id);
		productoActual.setNombreProducto(producto.getNombreProducto());
		productoActual.setCantidadProducto(producto.getCantidadProducto());
		productoActual.setCodigoProducto(producto.getCodigoProducto());
		productoActual.setDescripcionProducto(producto.getDescripcionProducto());
		productoActual.setPrecioPreventa(producto.getPrecioPreventa());
		productoActual.setPrecioVenta(producto.getPrecioVenta());
		productoActual.setSede(producto.getSede());
		productoActual.setFechaRegistro(new Date());
		return productoServicio.save(productoActual);
		
	}
	
	@DeleteMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoServicio.delete(id);
	}
}

