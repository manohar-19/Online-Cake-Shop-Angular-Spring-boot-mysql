import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CusomerService {
  private baseUrl = 'http://localhost:8084/cust';

  constructor( private http: HttpClient) { }

  login(user,password){
   
    return this.http.get(`${this.baseUrl}/`+user+'/'+password);
  }

  cartInitialize(){
   return  this.http.get('http://localhost:8084/userLogin');
  }
 
  createCustomer(customer:object):Observable<object>{
    return this.http.post('http://localhost:8084/custAdd',customer);
  }

  updateCustomer(customer:object): Observable<Object> {
    return this.http.put(`${this.baseUrl}`, customer);
    }
 

    logout(){
      console.log("inside logout service")
      return this.http.get(`http://localhost:8084/Logout`);
    }

    getCustomer(): Observable<any>{
      return  this.http.get('http://localhost:8084/cust');
     }

     updatePassword(user,answer,password){
   
      return this.http.get(`http://localhost:8084/passwordUpdate/`+user+'/'+answer+'/'+password);
    }

}
