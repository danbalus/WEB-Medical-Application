import { Component, OnInit } from '@angular/core';
import { Doctor } from 'src/app/models/doctor';
import { Router } from '@angular/router';
import { DoctorService } from 'src/app/service/doctor.service';

import { TranslateService } from '@ngx-translate/core';


@Component({
  selector: 'app-doctor-page',
  templateUrl: './doctor-page.component.html',
  styleUrls: ['./doctor-page.component.scss']
})
export class DoctorPageComponent implements OnInit {


  doctors:Array<Doctor>=new Array<Doctor>();

  constructor(private router:Router,private doctorService:DoctorService,
    private translateService: TranslateService) {
      if(localStorage.getItem('language') == '0'){
        translateService.setDefaultLang('en');
      }else{
        translateService.setDefaultLang('ro');
      }
      
     }

  ngOnInit() {
    this.getAllDoctors();
    //console.log('doctors is ');
  }
  getAllDoctors(){
    this.doctorService.getAllDoctors().subscribe((doctors)=>this.doctors=doctors);
  }


  

  switchLanguage(language: string) {
    if(language == "en"){
      localStorage.setItem('language', '0');
    }else{
      localStorage.setItem('language', '1');
    }
    this.translateService.use(language);
  }
}
