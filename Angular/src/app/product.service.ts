import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  public scope:Array<any>;
  private baseUrl = 'http://localhost:8084/prod';

  constructor( private http: HttpClient) { }

  getProdDetailsbyId(id:number): Observable<any>{
    return this.http.get(`http://localhost:8084/prod/`+id);
  }
  getProdDetails(): Observable<any> {
    return this.http.get(`${this.baseUrl}/`);
  }

  getSingleProd(id:number): Observable<any>{
    return this.http.get(`http://localhost:8084/singleProd/`+id);
  }

  addtoCart(prodId:number,qty:number) : Observable<any> {
    return this.http.get(`http://localhost:8084/addCart/`+prodId+'/'+qty);
  }

  setObject(scope:any){
    this.scope=scope;
  }
  getScope():Array<any>{
    return this.scope;
  }

}
