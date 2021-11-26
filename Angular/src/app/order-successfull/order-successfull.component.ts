import { Component, OnInit } from '@angular/core';
import { Routes, RouterModule, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Customer } from '../login/customer';
import { CusomerService } from '../cusomer.service';
@Component({
  selector: 'app-order-successfull',
  templateUrl: './order-successfull.component.html',
  styleUrls: ['./order-successfull.component.css']
})
export class OrderSuccessfullComponent implements OnInit {

  customer:Observable<Customer[]>
  
  constructor(private CusomerService: CusomerService,
    private router: Router) { }
    

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.customer = this.CusomerService.getCustomer();
  }
}
