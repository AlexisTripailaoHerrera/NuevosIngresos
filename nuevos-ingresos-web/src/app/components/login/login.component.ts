import { Component } from '@angular/core';
import { UsuarioService } from '../../services/usuario.service';
import { UsuarioVo } from '../../models/usuario.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';
  message: string = ''; // Definición de la variable message

  constructor(private usuarioService: UsuarioService, private router: Router) { }

  login(): void {
    if (this.username && this.password) {
      this.usuarioService.login(this.username, this.password)
        .subscribe(
          {
            next: (usuarios: UsuarioVo[]) => {
              if (usuarios.length > 0) {
                this.router.navigate(['/usuarios']);
              } else {
                this.message = 'Usuario o contraseña incorrecta';
              }
            },
            error: (error) => {
              console.error('Error en la solicitud:', error);
            }
          }
        );
    } else {
      this.message = 'Debe ingresar ambos campos';
    }
  }
}

