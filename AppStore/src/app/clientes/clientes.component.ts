import { Component, OnInit } from '@angular/core';
import { Clientes } from './clientes';
import { ClientesService } from './clientes.service';
import { CLIENTES } from './clientes.json';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'})
export class ClientesComponent implements OnInit {
  clientes:Clientes[];
  constructor(private clientesService:ClientesService) { }

  ngOnInit(): void {
    this.clientesService.getClientes().subscribe(
      clientes => this.clientes=clientes
    );
    /*(clientes: Clientes[])=>{
      this.clientes=CLIENTES;
    }*/
  }
}