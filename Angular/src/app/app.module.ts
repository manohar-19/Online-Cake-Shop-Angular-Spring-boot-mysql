import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { ProductComponent } from './product/product.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';
import { CartComponent } from './cart/cart.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { OrderSuccessfullComponent } from './order-successfull/order-successfull.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminOrderDetailsComponent } from './admin-order-details/admin-order-details.component';
import { ForgetPasswordComponent } from './forget-password/forget-password.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    CreateCustomerComponent,
    ProductComponent,
    UpdateCustomerComponent,
    CartComponent,
    ProductDetailsComponent,
    OrderSuccessfullComponent,
    AdminLoginComponent,
    AdminOrderDetailsComponent,
    ForgetPasswordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
