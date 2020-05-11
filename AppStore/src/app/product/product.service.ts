import { Injectable } from '@angular/core';
import { PRODUCTS } from './product.json';
import { Product } from './product';
import { Observable } from 'rxjs';
import { of } from 'rxjs'
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators'
import { Factura } from './factura';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private urlEndPoint:string='http://localhost:8090/api/productos';
  private urlEndPointFac:string='http://localhost:8090/api/factura';
  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'});
  constructor(private http: HttpClient) { 
  }
  getProduct(): Observable<Product[]>{
    //return of(PRODUCTS);
   /* return this.http.get<Product[]>(this.urlEndPoint).pipe(
      map(response=>response as Product[])
    );*/
    return this.http.get<Product[]>(this.urlEndPoint);
  }
  create(product:Product): Observable<Product[]>{
    return this.http.post<Product[]>(this.urlEndPoint,product,{headers:this.httpHeaders});
  }
  createFac(factura:Factura):Observable<Factura[]>{
    return this.http.post<Factura[]>(this.urlEndPointFac,factura,{headers:this.httpHeaders});
  }
  getProducto(id): Observable<Product>{
    return this.http.get<Product>(`${this.urlEndPoint}/${id}`)
  }
}
