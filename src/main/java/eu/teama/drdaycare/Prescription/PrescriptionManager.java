package eu.teama.drdaycare.Prescription;
import eu.teama.drdaycare.DatabaseHandler.DatabaseController;
import eu.teama.drdaycare.Login.jsonData.PrescriptionRequest;
import eu.teama.drdaycare.Login.jsonData.PrescriptionResponse;
import eu.teama.drdaycare.UserTypes.Prescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service

public class PrescriptionManager {
    Logger logger = LoggerFactory.getLogger(PrescriptionManager.class);

    @Autowired
    private final DatabaseController databaseController;

    public PrescriptionManager( final DatabaseController databaseController){this.databaseController = databaseController;}

    public PrescriptionResponse getPrescription(PrescriptionRequest prescriptionRequest) {
        Iterable<Prescription> allPrescriptions = databaseController.getAllPrescriptions();

        for (Prescription prescription: allPrescriptions){
            if (prescriptionRequest.getPrescriptionid() == (prescription.getPrescriptionid()) && prescriptionRequest.getPrescriptionid() == (prescription.getPrescriptionid()) ){
                return new PrescriptionResponse(prescription);
            }
        }
        logger.info("Could not find Prescription " );
        return new PrescriptionResponse( null);
    }


}
