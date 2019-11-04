package eu.teama.drdaycare.Prescription.jsonData;

public class PrescriptionRequest {
    private final Integer patientid;

    public PrescriptionRequest(Integer patientid){
        this.patientid = patientid;

    }

    public int getPatientid(){
        return patientid;
    }

    }
