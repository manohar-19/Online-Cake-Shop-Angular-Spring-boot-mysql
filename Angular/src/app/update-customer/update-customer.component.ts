import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';
import { CusomerService } from '../cusomer.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {

  customer: Customer = new Customer();
  getcustomer:Observable<Customer[]>


  submitted = false;
  constructor(private customerService: CusomerService,
    private router: Router) { }

  ngOnInit() {

    this.reloadData();
  }

  reloadData() {
   
    this.getcustomer = this.customerService.getCustomer();
  }

  // newCustomer(): void {
  //   this.submitted = false;
  //   this.customer = new Customer(); 
  // }
  save() {
   console.log(this.customer);
    this.customerService.updateCustomer(this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
      console.log(this.customer);
    this.customer = new Customer();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    
    this.save();
  }

  gotoList() {
    alert("customer updated Successfully");
    this.router.navigate(['home']);
  }
}
