import { Component, OnInit, Input } from '@angular/core';
import { Doctor } from 'src/app/models/doctor';
import { Router } from '@angular/router';
import { DoctorService } from 'src/app/service/doctor.service';

import { TranslateService } from '@ngx-translate/core';


@Component({
  selector: 'app-specific-doctor',
  templateUrl: './specific-doctor.component.html',
  styleUrls: ['./specific-doctor.component.scss'],
  //template: 'Example: {{medicalUnitName}}'
})
export class SpecificDoctorComponent implements OnInit {
  //@Input() medicalUnitName: string;
  
  doctors:Array<Doctor>=new Array<Doctor>();
  fdoctors:Array<Doctor>=new Array<Doctor>();
  medicalUnitName: string;
  
  constructor(private router:Router,private doctorService:DoctorService,
    private translateService: TranslateService) {
      if(localStorage.getItem('language') == '0'){
        translateService.setDefaultLang('en');
      }else{
        translateService.setDefaultLang('ro');
      }
      this.medicalUnitName= localStorage.getItem('unitName');
      
     }

  ngOnInit() {
    //this.getAllDoctors();
    //console.log('doctors is ');
   // console.log(this.medicalUnitName);
    this.filterDoctors();
  }
  getAllDoctors(){
    this.doctorService.getAllDoctors().subscribe((doctors)=>this.doctors=doctors);
  }
   filterDoctors(){
     //this.doctors.map(doctors =>{let f1 = doctors.name(doctors => doctors.medicalUnit == this.medicalUnitName)});
    // this.doctors = this.doctors.filter(x =>x.medicalUnit == this.medicalUnitName)[0];
    this.doctorService.getSpecificDoctors(this.medicalUnitName).subscribe((doctors)=>this.doctors=doctors);
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
