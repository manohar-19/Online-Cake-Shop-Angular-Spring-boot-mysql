import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { Router } from '@angular/router';
import { CusomerService } from '../cusomer.service';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {
  model1: any = {};
  model: any = {};
  constructor(private productService: ProductService,private CusomerService: CusomerService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
   
  }

  reloadData() {
    this.model = this.productService.getScope();
  }

  addtocart(prodId:number){
    console.log(prodId);
   var quantity=this.model1.quantity;
   console.log("quantity");
   console.log(quantity);
    this.productService.addtoCart(prodId,quantity).subscribe(data => console.log(data), error => console.log(error));

    var val=this.CusomerService.cartInitialize().subscribe(data => console.log(data), error => console.log(error));
         console.log(val);
          console.log("order initialized successfully")

    alert("item Added Successfully");
  }
  
  
}
