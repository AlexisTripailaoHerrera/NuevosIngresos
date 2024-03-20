import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { ListaGeneralComponent } from './components/lista-general/lista-general.component'; // Importa RouterModule aquí

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ListaGeneralComponent
  ],
  imports: [
    BrowserModule,
    RouterModule, // Añade RouterModule aquí
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

