package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1



/**
 * LabTestImages generated by hbm2java
 */
public class LabTestImages  implements java.io.Serializable {


     private LabTestImagesId id;
     private String testImage;

    public LabTestImages() {
    }

    public LabTestImages(LabTestImagesId id, String testImage) {
       this.id = id;
       this.testImage = testImage;
    }
   
    public LabTestImagesId getId() {
        return this.id;
    }
    
    public void setId(LabTestImagesId id) {
        this.id = id;
    }
    public String getTestImage() {
        return this.testImage;
    }
    
    public void setTestImage(String testImage) {
        this.testImage = testImage;
    }




}


