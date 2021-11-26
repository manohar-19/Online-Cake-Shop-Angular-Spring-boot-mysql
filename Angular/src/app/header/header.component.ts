import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { CusomerService } from '../cusomer.service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private customerService: CusomerService,
    private router: Router) { }

  ngOnInit() {
  }
  logout(){
    let val=this.customerService.logout().subscribe(data => console.log(data), error => console.log(error));
    console.log(val);
    console.log("inside logout")
    this.router.navigate(['']);
  }
}
