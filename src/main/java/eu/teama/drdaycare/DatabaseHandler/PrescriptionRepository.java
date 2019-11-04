package eu.teama.drdaycare.DatabaseHandler;

import eu.teama.drdaycare.UserTypes.Prescription;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PrescriptionRepository extends CrudRepository<Prescription,Integer> {

    //Example of custom made method query, which gets all prescription  with corresponding patient ID
    @Query("SELECT u FROM prescription u where u.patientid = :patientid")
    Iterable <Prescription> findPrescriptionByPatientid(@Param("Patient") int patientid );

    }

