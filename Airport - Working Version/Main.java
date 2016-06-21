import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        UserInterface UI = new UserInterface(reader);
        
        //UI.start();
        
        UI.airportPanel();
        
        /*Airport myAirport = new Airport();
        
        Airplane bob = new Airplane("bob",2);
        myAirport.addAirplane(bob);
        System.out.println(bob.toString());
        Airplane zoe = new Airplane("zoe",2);
        myAirport.addAirplane(zoe);
        Airplane tal = new Airplane("tal",2);
        myAirport.addAirplane(tal);
        
        myAirport.printAirplanes();
        
        myAirport.getSpecificAirplane("zoe");*/
        
    }
}
