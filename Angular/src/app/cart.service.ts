import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http: HttpClient) { }

  viewCart(): Observable<any> {
    return this.http.get(`http://localhost:8084/viewCart`);
  }

  deleteCartItem(prodId:any): Observable<any> {
    console.log("deleteCartItem function ")
    console.log(prodId)
    return this.http.delete(`http://localhost:8084/remove/`+prodId);
  }

  getTotal(): Observable<any>{
    return this.http.get(`http://localhost:8084/total`);
  }


}
