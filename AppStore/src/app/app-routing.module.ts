import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { ClientesComponent } from './clientes/clientes.component';
import { EmpleadosComponent } from './empleados/empleados.component';
import { FormComponent } from './clientes/form.component';
import { FormProductComponent } from './product/form-product.component';
import { CarritoComponent } from './product/carrito/carrito.component'




const routes: Routes = [
  {path:'',redirectTo:'/product',pathMatch:'full'},
  {path:'product',component:ProductComponent},
  {path:'clientes',component:ClientesComponent},
  {path:'empleados',component:EmpleadosComponent},
  {path:'clientes/form', component:FormComponent},
  {path:'clientes/form/:id', component:FormComponent},
  {path:'product/form-product', component:FormProductComponent},
  {path:'product/form-product/:id', component:FormProductComponent},
  {path:'product/carrito',component:CarritoComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
