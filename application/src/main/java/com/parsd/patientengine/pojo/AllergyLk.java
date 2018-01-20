package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AllergyLk generated by hbm2java
 */
public class AllergyLk  implements java.io.Serializable {


     private int allergyId;
     private String allergyName;
     private String allergyType;
     private Set<PatientAllergy> patientAllergies = new HashSet<PatientAllergy>(0);

    public AllergyLk() {
    }

	
    public AllergyLk(int allergyId, String allergyName, String allergyType) {
        this.allergyId = allergyId;
        this.allergyName = allergyName;
        this.allergyType = allergyType;
    }
    public AllergyLk(int allergyId, String allergyName, String allergyType, Set<PatientAllergy> patientAllergies) {
       this.allergyId = allergyId;
       this.allergyName = allergyName;
       this.allergyType = allergyType;
       this.patientAllergies = patientAllergies;
    }
   
    public int getAllergyId() {
        return this.allergyId;
    }
    
    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }
    public String getAllergyName() {
        return this.allergyName;
    }
    
    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }
    public String getAllergyType() {
        return this.allergyType;
    }
    
    public void setAllergyType(String allergyType) {
        this.allergyType = allergyType;
    }
    public Set<PatientAllergy> getPatientAllergies() {
        return this.patientAllergies;
    }
    
    public void setPatientAllergies(Set<PatientAllergy> patientAllergies) {
        this.patientAllergies = patientAllergies;
    }




}

