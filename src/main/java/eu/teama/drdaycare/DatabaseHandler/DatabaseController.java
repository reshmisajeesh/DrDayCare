package eu.teama.drdaycare.DatabaseHandler;

import eu.teama.drdaycare.UserTypes.Prescription;
import eu.teama.drdaycare.UserTypes.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DatabaseController {

    Logger logger = LoggerFactory.getLogger(DatabaseController.class);

    @Autowired
    private UserRepository userRepository;
    private PrescriptionRepository PrescriptionRepository;

    //Inserting user into repository, making use of the the repository interfaces built in save functionality.
    public void insertUser(User user){
        logger.info("Attempting to add user " + user.getName() + " to database");
        userRepository.save(user);
        logger.info("" + user.getName() + " added to database");
    }

    //Returning single user from repository, found by users id and making use of the the repository interfaces built in save functionality.
    //Note Optional Type is used in the case that no user is found and thus none can be returned.
    public Optional<User> getSingleUser(int id){
        logger.info("Searching for user with id: " + id);
        Optional <User> user =  userRepository.findById(id);
        if (user.isPresent())   logger.info("" + user.get().getName() + "was found");
        else logger.error("Unable to find " + user.get().getName());
        return user;
    }

    //Returning an iterable of all available users, making use of build in repository methods and logging the size of object returned.
    public Iterable<User> getAllUsers(){
        logger.info("Attempting to return all users");
        Iterable<User> users = userRepository.findAll();
        logger.info("Returning " + getIterableSize(users) + " users from repository");
        return users;
    }

    //Returning an iterable of users based on userRole given. Makes use of custom made query method in userRepository.
    public Iterable<User> getUsersByRole(int userRole) {
        logger.info("Attempting to return all users with user role:" + userRole);
        Iterable<User> users = userRepository.userByRole(userRole);
        logger.info("Returning " + getIterableSize(users) + " many users");
        return users;
    }

    //Delete user from database, which relates to given ID. Makes use of built in repository
    public void deleteUser(int id){
        logger.info("Deleting user with id: " + id);
        userRepository.deleteById(id);
        logger.info("User with id " + id + " was deleted");
    }

    //Updating a single user object in database, making use of built method of repository
    public void updateUser(User user){
        logger.info("User with id " + user.getId() + " added to database");
        userRepository.save(user);
        logger.info("User with id " + user.getId() + " added to database");
    }

    //Method is used internally to get count of iterables for the purpose of logging.
    //If a similar method is required, feel free to overload
    private int getIterableSize(Iterable<User> iterable){
        int count = 0;
        for (Object object: iterable) {
            count++;
        }
        return count;
    }

    //Retrieving prescriptions from database, making use of built method of repository
    //public Iterable<Prescription> getPrescriptionById(int patientid){
      //  logger.info("Searching for Prescription  with id: " + patientid);
        //Iterable<Prescription> prescriptions = PrescriptionRepository.findPrescriptionByPatientid(patientid);
       //return prescriptions;
    //}
    //Retrieving all prescriptions from database, making use of built method of repository
    public Iterable<Prescription> getAllPrescriptions(){
        logger.info("Searching for All Prescriptions ");
        Iterable<Prescription> prescriptions = PrescriptionRepository.findAll();
        return prescriptions;
    }
}
