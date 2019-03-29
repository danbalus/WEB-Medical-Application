
export class Doctor{
    name:string;
    specialization:string;
    gradulationYear:string;
    profilePicture:string;
    medicalUnit:string;

    constructor(name:string,  specialization:string, 
        gradulationYear:string, profilePicture:string, medicalUnit:string) {
        this.name=name;
        this.specialization=specialization;
        this.gradulationYear=gradulationYear;
        this.profilePicture=profilePicture;
        this.medicalUnit=medicalUnit;
    }
}
