import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

getData: boolean;
  model: any = {};
  constructor(private adminService: AdminService,
    private router: Router) { }

  ngOnInit() {
  }

  loginUser() {

    var user = this.model.name;
    var password = this.model.password;
    console.log(user);
    console.log(password);
    
    this.adminService.getAdminDetails(user, password).subscribe(
      (res: boolean) => {
        
        this.getData = res;
        console.log("flag " + this.getData)
        if (this.getData == true) {
          alert("Logged in Successfully")
          this.router.navigate(['/adminOrderDetails']);
        }
        else{
          alert("Enter the valid Credentials")
        }
      }
    );

  }

}
