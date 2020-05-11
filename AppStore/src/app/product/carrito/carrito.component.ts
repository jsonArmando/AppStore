import { Component, OnInit } from '@angular/core';
import { Factura } from '../factura';
import { CarritoService } from './carrito.service';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-carrito',
  templateUrl: './carrito.component.html'
})
export class CarritoComponent implements OnInit {
  factura:Factura[];
  total:number;
  constructor(private http: HttpClient,
    private carritoService:CarritoService) { }

  ngOnInit(): void {
    this.carritoService.getFacturas().subscribe(
      factura=>this.factura=factura
    )

    this.total = this.factura.reduce((
      acc,
      obj,
    )=> acc + (obj.precioVenta),0);
    console.log('Total' + this.total);
  }

}