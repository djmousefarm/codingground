import java.util.*;
public class Airport {
    private ArrayList<Airplane> Airplanes;
    
    public Airport() {
        this.Airplanes = new ArrayList<Airplane>();
    }
    
    public void addAirplane (Airplane airplane) {
        Airplanes.add(airplane);
    }
    
    public ArrayList getAirplanes() {
        return Airplanes;
    }
    
    public String printAirplanes() {
        for (Airplane listedAirplane : Airplanes) {
            return listedAirplane.toString();
        }
    }

    public Airplane getSpecificAirplane(String ID) {
        for (Airplane listedAirplane : Airplanes) {
            if (listedAirplane.getID()==ID) return listedAirplane;
        }
        return null;        
    }
}