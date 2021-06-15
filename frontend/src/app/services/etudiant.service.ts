import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Etudiant } from '../models/etudiant';

@Injectable({
  providedIn: 'root'
})
export class EtudiantService {

  private baseURL="http://localhost:8081/etudiant/"

  constructor(private httpClient: HttpClient) { }
  getEtudiantList(): Observable<Etudiant[]>{
    return this.httpClient.get<Etudiant[]>(`${this.baseURL}`);
  }


  CreateEtudiant(etudiant: Etudiant): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}add`,etudiant);
  }

  getEtudiantById(id: number): Observable<Etudiant>{
    return this.httpClient.get<Etudiant>(`${this.baseURL}find?id=${id}`);
  }

  updateEtudiant(id: number, etudiant: Etudiant): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}update?id=${id}`, etudiant);
  }
  deleteEtudiant(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}remove?id=${id}`);
  }
}
