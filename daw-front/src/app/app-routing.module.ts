import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MainPageComponent } from './components/main-page/main-page.component';
import { DoctorPageComponent } from './components/doctor-page/doctor-page.component';
import { MedicalUnitPageComponent } from './components/medical-unit-page/medical-unit-page.component';
import { SpecificDoctorComponent } from './components/specific-doctor/specific-doctor.component';

const routes: Routes = [
  {path: '',
  component: MainPageComponent
  },
  {
  path:'doctor',
  component: DoctorPageComponent
  },
  {
    path:'medical-unit',
    component: MedicalUnitPageComponent
  },
  {
    path:'specific-doctor',
    component: SpecificDoctorComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
