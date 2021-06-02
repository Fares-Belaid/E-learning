import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Formateur } from '../models/formateur';

@Injectable({
  providedIn: 'root'
})
export class FormateurService {

  private baseURL="http://localhost:8081/formateur/"

  constructor(private httpClient: HttpClient) { }

  getFormateurList(): Observable<Formateur[]>{
    return this.httpClient.get<Formateur[]>(`${this.baseURL}`);
  }


  CreateFormateur(formateur: Formateur): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}add`,formateur);
  }
}
