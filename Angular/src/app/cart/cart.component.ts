import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Cart } from '../cart';
import { CartService } from '../cart.service';
import { CusomerService } from '../cusomer.service';
import { Order } from '../order';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  carts:Observable<Cart[]>

  order: Observable<Order[]>
 
  
  constructor(private cartService: CartService,private customerService: CusomerService,
    private router: Router) { }

    ngOnInit() {
      this.reloadData();
    }
  
    reloadData() {
      this.carts = this.cartService.viewCart();
      this.order=this.cartService.getTotal();
      console.log("inside total")
      console.log(this.order);
       console.log("inside total")
       
    //  console.log(Object.keys(this.carts).length); 

    }

    deleteOrderDetails(id:number){
      console.log("inside delete order details");
      console.log(id);
      var val= this.cartService.deleteCartItem(id).subscribe(data => console.log(data), error => console.log(error));;
      console.log("outside delete order details");
      console.log(val);
      alert('item deleted successful')
      this.router.navigate(['home']);
    }

    logout(){
      let val=this.customerService.logout().subscribe(data => console.log(data), error => console.log(error));
      console.log(val);
      console.log("inside logout")

      var val1=this.customerService.cartInitialize().subscribe(data => console.log(data), error => console.log(error));
         console.log(val1);
          console.log("order initialized successfully");
      this.router.navigate(['cart/orderConfirm']);
    }

}
