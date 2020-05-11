import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Empleados } from './empleados';
import { EMPLEADOS } from './empleados.json';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmpleadosService {

  private urlEndPoint:string='http://localhost:8090/app/empleados';
  constructor(private http: HttpClient) { 
  }
  getEmpleados():Observable<Empleados[]>{
    //return of(EMPLEADOS);
    return this.http.get<Empleados[]>(this.urlEndPoint);
  }
}