package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1



/**
 * ProcedureLk generated by hbm2java
 */
public class ProcedureLk  implements java.io.Serializable {


     private int procedureId;
     private String procedureDesc;

    public ProcedureLk() {
    }

    public ProcedureLk(int procedureId, String procedureDesc) {
       this.procedureId = procedureId;
       this.procedureDesc = procedureDesc;
    }
   
    public int getProcedureId() {
        return this.procedureId;
    }
    
    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }
    public String getProcedureDesc() {
        return this.procedureDesc;
    }
    
    public void setProcedureDesc(String procedureDesc) {
        this.procedureDesc = procedureDesc;
    }




}


