package eu.teama.drdaycare.Prescription.jsonData;

public class PrescriptionRequest {
    private final Integer prescriptionid;

    public PrescriptionRequest(Integer prescriptionid){
        this.prescriptionid = prescriptionid;

    }

    public int getPrescriptionid(){
        return prescriptionid;
    }

    }
