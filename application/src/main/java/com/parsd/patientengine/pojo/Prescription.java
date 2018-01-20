package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1



/**
 * Prescription generated by hbm2java
 */
public class Prescription  implements java.io.Serializable {


     private PrescriptionId id;
     private MedicationLk medicationLk;
     private PatientEvent patientEvent;
     private String drugDosage;
     private String doctorNotes;

    public Prescription() {
    }

	
    public Prescription(PrescriptionId id, MedicationLk medicationLk, PatientEvent patientEvent, String drugDosage) {
        this.id = id;
        this.medicationLk = medicationLk;
        this.patientEvent = patientEvent;
        this.drugDosage = drugDosage;
    }
    public Prescription(PrescriptionId id, MedicationLk medicationLk, PatientEvent patientEvent, String drugDosage, String doctorNotes) {
       this.id = id;
       this.medicationLk = medicationLk;
       this.patientEvent = patientEvent;
       this.drugDosage = drugDosage;
       this.doctorNotes = doctorNotes;
    }
   
    public PrescriptionId getId() {
        return this.id;
    }
    
    public void setId(PrescriptionId id) {
        this.id = id;
    }
    public MedicationLk getMedicationLk() {
        return this.medicationLk;
    }
    
    public void setMedicationLk(MedicationLk medicationLk) {
        this.medicationLk = medicationLk;
    }
    public PatientEvent getPatientEvent() {
        return this.patientEvent;
    }
    
    public void setPatientEvent(PatientEvent patientEvent) {
        this.patientEvent = patientEvent;
    }
    public String getDrugDosage() {
        return this.drugDosage;
    }
    
    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }
    public String getDoctorNotes() {
        return this.doctorNotes;
    }
    
    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }




}

