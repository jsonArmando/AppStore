import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Factura } from './factura';
import swal from'sweetalert2';

@Component({
  selector: 'app-form-product',
  templateUrl: './form-product.component.html'
})
export class FormProductComponent implements OnInit {

  productos: Product = new Product();
  factura:Factura = new Factura();
  title: string = "Comprar el Producto";
  constructor(private productService: ProductService,
    private router: Router,
    private activateRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.cargarProducto();
  }
  createFac(): void {
   // console.log("Clicked!");
   // console.log(this.productos);
   this.productService.createFac(this.productos)
   .subscribe(productos =>{
     this.router.navigate(['/product'])
     swal.fire('Agregado Al Carrito',`Desea adicionar algo más`,'success')
   });
  }

  cargarProducto(): void {
    this.activateRoute.params.subscribe(params => {
      let id = params['id']
      if (id) {
        this.productService.getProducto(id).subscribe((productos) => this.productos = productos);
      }
    }
    );
  }
}





