import { Component, OnInit } from '@angular/core';
import { Clientes } from './clientes';
import { ClientesService } from './clientes.service';
import { Router,ActivatedRoute } from '@angular/router';
import swal from'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {
  clientes: Clientes = new Clientes();
  title: string = "Registre Los Datos Personales Para continuar con la Compra";
  constructor(private clientesService: ClientesService,
    private router: Router,
    private activateRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.cargarCliente();
  }

  cargarCliente():void{
    this.activateRoute.params.subscribe(params=>{
      let id = params['id']
      if(id){
        this.clientesService.getCliente(id).subscribe((clientes)=>this.clientes=clientes)
      }
    })
  }

  create(): void {
    //console.log("Clicked!");
    //console.log(this.clientes);
    this.clientesService.create(this.clientes)
    
    .subscribe(clientes => {
        this.router.navigate(['/clientes'])
        swal.fire('Nuevo Cliente', `Cliente creado con éxito`,'success')
      }
    );
  }

  update():void{
    this.clientesService.update(this.clientes)
    .subscribe(cleinte=>{
      this.router.navigate(['/clientes'])
      swal.fire('Cliente Actualizado',`Cliente Actualizado con éxito`,'success')
    }

    )
  }

}
