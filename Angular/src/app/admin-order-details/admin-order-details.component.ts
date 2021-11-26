import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AdminService } from '../admin.service';
import { AdminOrderDetails } from './admin-order-details';

@Component({
  selector: 'app-admin-order-details',
  templateUrl: './admin-order-details.component.html',
  styleUrls: ['./admin-order-details.component.css']
})
export class AdminOrderDetailsComponent implements OnInit {
  order:Observable<AdminOrderDetails[]>
  
  constructor(private adminService: AdminService,
    private router: Router) { }

  ngOnInit() {
    this.reload();
  }

  reload(){
    this.order= this.adminService.getOrder();
  }
}
