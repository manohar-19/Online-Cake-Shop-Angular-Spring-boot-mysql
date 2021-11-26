import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  product: Observable<Product[]>
  model: any = {};

  constructor(private productService: ProductService,
    private router: Router) { }


  ngOnInit() {
    this.reloadData();

  }
  reloadData() {
    this.model = this.productService.getScope();
  }

  productSelect(id: number) {
    console.log("inside prod select")
    this.product=this.productService.getSingleProd(id);
    this.productService.setObject(this.product);
    this.router.navigate(['/productDetails']);
  }

}
