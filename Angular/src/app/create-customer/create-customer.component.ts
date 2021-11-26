import { Component, OnInit } from '@angular/core';
import { Customer } from './customer';
import { CusomerService } from '../cusomer.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  customer: Customer = new Customer();



  submitted = false;
  constructor(private customerService: CusomerService,
    private router: Router) { }

  ngOnInit() {
  }

  newCustomer(): void {
    this.submitted = false;
    this.customer = new Customer();
  }
  save() {
   console.log(this.customer);
    this.customerService.createCustomer(this.customer)
      .subscribe(data => console.log(data), error => console.log(error));
      console.log(this.customer);
      alert("user created Successfully");
    this.customer = new Customer();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    
    this.save();
  }

  gotoList() {
    this.router.navigate(['']);
  }
}
