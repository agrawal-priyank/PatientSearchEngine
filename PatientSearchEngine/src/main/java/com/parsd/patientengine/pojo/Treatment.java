package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1



/**
 * Treatment generated by hbm2java
 */
public class Treatment  implements java.io.Serializable {


     private TreatmentId id;
     private PatientEvent patientEvent;
     private String treatmentDesc;
     private Integer procedureId;

    public Treatment() {
    }

	
    public Treatment(PatientEvent patientEvent) {
        this.patientEvent = patientEvent;
    }
    public Treatment(PatientEvent patientEvent, String treatmentDesc, Integer procedureId) {
       this.patientEvent = patientEvent;
       this.treatmentDesc = treatmentDesc;
       this.procedureId = procedureId;
    }
   
    public TreatmentId getId() {
        return this.id;
    }
    
    public void setId(TreatmentId id) {
        this.id = id;
    }
    public PatientEvent getPatientEvent() {
        return this.patientEvent;
    }
    
    public void setPatientEvent(PatientEvent patientEvent) {
        this.patientEvent = patientEvent;
    }
    public String getTreatmentDesc() {
        return this.treatmentDesc;
    }
    
    public void setTreatmentDesc(String treatmentDesc) {
        this.treatmentDesc = treatmentDesc;
    }
    public Integer getProcedureId() {
        return this.procedureId;
    }
    
    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }




}


