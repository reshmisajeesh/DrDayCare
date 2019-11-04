package eu.teama.drdaycare.Prescription;
import eu.teama.drdaycare.DatabaseHandler.DatabaseController;
import eu.teama.drdaycare.UserTypes.User;
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
    public PrescriptionManager( final DatabaseController databaseController){this.databaseController =databaseController;}
}
