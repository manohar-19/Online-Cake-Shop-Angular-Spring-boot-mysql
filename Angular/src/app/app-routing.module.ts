import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { ProductComponent } from './product/product.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { CartComponent } from './cart/cart.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { OrderSuccessfullComponent } from './order-successfull/order-successfull.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminOrderDetailsComponent } from './admin-order-details/admin-order-details.component';
import { ForgetPasswordComponent } from './forget-password/forget-password.component';
const routes: Routes =[ 
{path:"", component: LoginComponent},
{path: "home", component: HomeComponent},
{path: "signup", component: CreateCustomerComponent},
{path:"product",component:ProductComponent},
{path:"updateCustomer",component:UpdateCustomerComponent},
{path:"cart",component:CartComponent},
{path:"productDetails",component:ProductDetailsComponent},
{path:"cart/orderConfirm",component:OrderSuccessfullComponent},
{path:"admin", component:AdminLoginComponent},
{path:"adminOrderDetails", component:AdminOrderDetailsComponent},
{path:"forgetPassword", component:ForgetPasswordComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
