import java.util.*;
public class VehicleRegister {
    private final RegistrationPlate regPlate;
    private String owner;
    private HashMap<RegistrationPlate, String> owners;
    //the vehicle register has to store the owner information into a 
    //HashMap<RegistrationPlate, String> owners object variable!
    
    public VehicleRegister(RegistrationPlate regPlate, String owner) {
        this.regPlate = regPlate;
        this.owner = owner;
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        //which adds the parameter owner of the car which corresponds to the 
        //parameter registration plate. The method returns true if the car had 
        //no owner; if the car had an owner already, the method returns false 
        //and it doesn't do anything 
        if (plate == null) return false;
        
        if (owners.contains(plate) && owners.get(plate)!=null) {
            owners.put(plate,owner);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String get(RegistrationPlate plate) {
        //which returns the car owner which corresponds to the parameter 
        //register number. If the car was not registered, it returns null
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        } else {
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate) {
        //which delete the information connected to the parameter registration 
        //plate. The method returns true if the information was deleted, and 
        //false if there was no information connected to the parameter in the 
        //register.
        
    }
    
    public void printRegistrationPlates() {
        //which prints out all the registration plates stored
        
    }
    
    public void printOwners() {
        //which prints all the car owners stored. Each owner's name has to be 
        //printed only once, even though they had more than one car
        
    }
}