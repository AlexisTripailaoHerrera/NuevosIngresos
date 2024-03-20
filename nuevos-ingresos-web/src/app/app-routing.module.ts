import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ListaGeneralComponent } from './components/lista-general/lista-general.component';

const routes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'usuarios', component: ListaGeneralComponent},
  {path:'**', redirectTo:'/'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
