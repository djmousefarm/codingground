import java.util.*;
public class Airport {
    private ArrayList<Airplane> Airplanes;
    
    public Airport() {
        Airplanes = new ArrayList<Airplane>();
    }
    
    public void addAirplane (Airplane airplane) {
        Airplanes.add(airplane);
    }
    
    public ArrayList getAirplanes() {
        return Airplanes;
    }
    
    public void printAirplanes() {
        for (Airplane listedAirplane : Airplanes) {
            System.out.println(listedAirplane.toString());  // Not returning anything!
        }
        //return null;
    }

    public void getSpecificAirplaneString(String ID) {
        for (Airplane listedAirplane : Airplanes) {
            if (listedAirplane.getID().equals(ID)) System.out.println(listedAirplane.toString());  // Not returning anything!
        }
        //return null;        
    }
    
    public Airplane getSpecificAirplaneObject(String ID) {
        for (Airplane listedAirplane : Airplanes) {
            if (listedAirplane.getID().equals(ID)) return listedAirplane;  // Not returning anything!
        }
        return null;        
    }    
}