import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { CLIENTES } from './clientes.json';
import { Clientes} from './clientes';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {
  private urlEndPoint:string='http://localhost:8090/app/clientes';
  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'});
  constructor(private http: HttpClient) { 
  }
  getClientes(): Observable<Clientes[]>{
    //return of(CLIENTES);
    return this.http.get<Clientes[]>(this.urlEndPoint);
  }
  create(clientes: Clientes) : Observable<Clientes[]>{
    return this.http.post<Clientes[]>(this.urlEndPoint,clientes,{headers:this.httpHeaders});
  }
  getCliente(id): Observable<Clientes>{
    return this.http.get<Clientes>(`${this.urlEndPoint}/${id}`)
  }
  update(cliente:Clientes):Observable<Clientes>{
    return this.http.put<Clientes>(`${this.urlEndPoint}/${cliente.id}`,cliente,{headers:this.httpHeaders});
  }
}


