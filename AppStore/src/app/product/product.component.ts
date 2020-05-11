import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product.service';
import { PRODUCTS } from './product.json';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html'
})
export class ProductComponent implements OnInit {
  product: Product[];
  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getProduct().subscribe(
      product => this.product=product
    );
  }

}
