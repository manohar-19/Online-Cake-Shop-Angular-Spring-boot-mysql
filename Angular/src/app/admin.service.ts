import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor( private http: HttpClient) { }

  getAdminDetails(user,password){
   
    return this.http.get(`http://localhost:8084/admin/`+user+'/'+password);
  }

  getOrder(): Observable<any>{
    return  this.http.get('http://localhost:8084/adminOrder');
   }

}
