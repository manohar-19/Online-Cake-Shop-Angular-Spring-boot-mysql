import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Router } from '@angular/router';
import { CusomerService } from '../cusomer.service';
import { Customer } from './customer';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  getData: boolean;
  model: any = {};
  constructor(private CusomerService: CusomerService,
    private router: Router) { }

  ngOnInit() {

  }

  loginUser() {

    var user = this.model.name;
    var password = this.model.password;
    console.log(user);
    console.log(password);
    
    this.CusomerService.login(user, password).subscribe(
      (res: boolean) => {
        
        this.getData = res;
        console.log("flag " + this.getData)
        if (this.getData == true) {
          
          var val=this.CusomerService.cartInitialize().subscribe(data => console.log(data), error => console.log(error));
         console.log(val);
          console.log("order initialized successfully")
          alert("Logged in Successfully")
          this.router.navigate(['/home']);
        }
        else{
          alert("Enter the valid Credentials")
        }
      }
    );

  }
}
