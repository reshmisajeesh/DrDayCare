package eu.teama.drdaycare.Login.jsonData;

import eu.teama.drdaycare.UserTypes.Prescription;

public class PrescriptionResponse {

    private final Prescription prescription;

    public PrescriptionResponse( Prescription prescription) {
           this.prescription = prescription;
    }

    public Prescription getPrescription(){return prescription;}
}