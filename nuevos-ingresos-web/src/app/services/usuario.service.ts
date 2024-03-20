import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UsuarioVo } from '../models/usuario.model';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private baseUrl = 'http://localhost:8080'; // Cambiar la URL base según corresponda

  constructor(private http: HttpClient) { }

  login(username: string, password: string): Observable<UsuarioVo[]> {
    return this.http.post<UsuarioVo[]>(`${this.baseUrl}/usuario`, { username, password });
  }
}

