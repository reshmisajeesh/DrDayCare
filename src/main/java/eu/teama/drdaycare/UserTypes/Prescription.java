package eu.teama.drdaycare.UserTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer patientid;
    private String prescription;
    private Integer prescriptionid;
    private String name;
    private String Patient;
    private int userRole;
    private String email;
    public int getpatientid(){
        return patientid;
    }

 public Integer getPrescriptionid(){
  return prescriptionid;
}
    public Integer getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
}