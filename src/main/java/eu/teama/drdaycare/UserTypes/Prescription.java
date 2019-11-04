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

    private String name;

    private String Patient;

    private int userRole;

    private String email;

    public Prescription(String patient) {
        Patient = patient;
    }
    public Integer getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
}