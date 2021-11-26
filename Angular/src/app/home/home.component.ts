import { Component, OnInit } from '@angular/core';
import { Category } from '../../app/category';
import { Observable } from "rxjs";
import { Router } from '@angular/router';
import { CategoryService } from '../category.service';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { CusomerService } from '../cusomer.service';
import { Customer } from '../login/customer';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  catagory:Observable<Category[]>
   product:Observable<Product[]>
  customer:Observable<Customer[]>
  constructor(private catagoryService: CategoryService,private productService: ProductService,private CusomerService: CusomerService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.catagory = this.catagoryService.getCatagoryList();
    this.customer = this.CusomerService.getCustomer();
  }
  displayProduct(catId:any){
   
    this.product=this.productService.getProdDetailsbyId(catId);
    this.productService.setObject(this.product);
    
    this.router.navigate(['product']);
  }

}
