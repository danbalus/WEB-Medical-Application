import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Doctor } from '../models/doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  private doctorsUrl = "http://localhost:8080/doctors";
  headers: HttpHeaders = new HttpHeaders({ 'Content-Type': 'application/json'}); 

  constructor(private http:HttpClient) { }

  getAllDoctors():Observable<Array<Doctor>>{
    return this.http.get<Array<Doctor>>(this.doctorsUrl,{headers:this.headers});
  }
  getSpecificDoctors(name:string):Observable<Array<Doctor>>{
    return this.http.get<Array<Doctor>>(this.doctorsUrl +'/'+ name,{headers:this.headers});
  }
}
