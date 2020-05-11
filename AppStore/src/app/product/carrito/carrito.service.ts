import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Factura } from '../factura';

@Injectable({
  providedIn: 'root'
})
export class CarritoService {
  private urlEndPoint:string='http://localhost:8090/api/factura';
  private httpHeaders=new HttpHeaders({'Content-Type':'application/json'});

  constructor(private http: HttpClient) { }
  getFacturas(): Observable<Factura[]>{
    return this.http.get<Factura[]>(this.urlEndPoint);
  }
}
