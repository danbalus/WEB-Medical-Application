import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MedicalUnit } from '../models/medical-unit';

@Injectable({
  providedIn: 'root'
})
export class MedicalUnitService {
  
  private doctorsUrl = "http://localhost:8080/medical-units";
  headers: HttpHeaders = new HttpHeaders({ 'Content-Type': 'application/json'}); 

  constructor(private http:HttpClient) { }

  getAllMedicalUnits():Observable<Array<MedicalUnit>>{
    return this.http.get<Array<MedicalUnit>>(this.doctorsUrl,{headers:this.headers});
  }

}
