import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CusomerService } from '../cusomer.service';
@Component({
  selector: 'app-forget-password',
  templateUrl: './forget-password.component.html',
  styleUrls: ['./forget-password.component.css']
})
export class ForgetPasswordComponent implements OnInit {

  getData: boolean;
  model: any = {};
  constructor(private CusomerService: CusomerService,
    private router: Router) { }

  ngOnInit() {
  }
  passwordUpdate(){
    var user = this.model.name;
    var password = this.model.password;
    var answer = this.model.answer;
    console.log(user);
    console.log(password);
    console.log(answer);
    this.CusomerService.updatePassword(user,answer,password).subscribe(
      (res: boolean) => {
        
        this.getData = res;
        console.log("flag " + this.getData)
        if (this.getData == true) {

          alert("password Updated Successfully")
          this.router.navigate(['']);
        }
        else{
          alert("Enter the valid Credentials")
        }
      }
    );
  }

}
