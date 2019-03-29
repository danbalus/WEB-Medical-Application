import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MedicalUnitService } from 'src/app/service/medical-unit.service';
import { MedicalUnit } from 'src/app/models/medical-unit';
import { TranslateService } from '@ngx-translate/core';
import {SpecificDoctorComponent} from 'src/app/components/specific-doctor/specific-doctor.component'

@Component({
  selector: 'app-medical-unit-page',
  templateUrl: './medical-unit-page.component.html',
  styleUrls: ['./medical-unit-page.component.scss'],
  //template: '<app-specific-doctor [medicalUnitName]= "toSend"></app-specific-doctor>'
  //template: '{{toSend}}'
  //template: '<app-specific-doctor>{{toSend}}</app-specific-doctor>'

})
export class MedicalUnitPageComponent implements OnInit {

  medicalUnits:Array<MedicalUnit>=new Array<MedicalUnit>();
  toSend:string = 'Spitalul Clinic Municipal';

  constructor(private router:Router,private medicalUnitService:MedicalUnitService,
    private translateService: TranslateService) { 
      if(localStorage.getItem('language') == '0'){
        translateService.setDefaultLang('en');
      }else{
        translateService.setDefaultLang('ro');
      }
    }

  ngOnInit() {
    this.getAllMedicalUnits();
      }

  getAllMedicalUnits(){
    this.medicalUnitService.getAllMedicalUnits().subscribe((medicalUnits)=>this.medicalUnits=medicalUnits);
  }

  

  switchLanguage(language: string) {
    if(language == "en"){
      localStorage.setItem('language', '0');
    }else{
      localStorage.setItem('language', '1');
    }
    this.translateService.use(language);
  }

  setUnitName(unitName: string) {

      localStorage.setItem('unitName', unitName);

  }
}
