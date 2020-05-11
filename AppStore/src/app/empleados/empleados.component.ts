import { Component, OnInit } from '@angular/core';
import { Empleados} from './Empleados';
import { EmpleadosService } from './empleados.service';
@Component({
  selector: 'app-empleados',
  templateUrl: './empleados.component.html'
})
export class EmpleadosComponent implements OnInit {
  empleados:Empleados[];
  constructor(private empleadosService:EmpleadosService) { }

  ngOnInit(): void {
    this.empleadosService.getEmpleados().subscribe(
      empleados=>this.empleados=empleados
    );
  }
}