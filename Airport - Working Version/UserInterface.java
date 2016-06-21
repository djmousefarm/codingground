import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner reader;
    private Flights setOfFlights;
    private Airport currentAirport;
    
    public UserInterface (Scanner reader) {
        this.reader = reader;
        this.setOfFlights = new Flights();
        this.currentAirport = new Airport();
    }
    
    public void start() {
        
    }
    
    public void airportPanel() {
       
        while(true) {
            System.out.println("Airport panel");
            System.out.println("--------------------");        

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");
            String input = this.reader.nextLine();
            input = input.toLowerCase().trim();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                flightService();
                break;
            }
        }

    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String ID = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = this.reader.nextInt();
        //Airplane newAirplane = ;
        currentAirport.addAirplane(new Airplane(ID,capacity));
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String ID = this.reader.nextLine();
        Airplane myAirplane = currentAirport.getSpecificAirplaneObject(ID);
        System.out.print("Give departure airport code: ");
        String depAirCode = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destAirCode = this.reader.nextLine();
        FlightPath flightpath = new FlightPath(myAirplane,depAirCode,destAirCode);
        setOfFlights.addFlight(flightpath);
    }    
    
    public void flightService() {
        
        System.out.println("Flight service");
        System.out.println("------------");
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print(">");
            String input = this.reader.nextLine();
            input = input.toLowerCase().trim();
            if (input.equals("1")) {
                this.printPlanes();
            } else if (input.equals("2")) {
                this.printFlights();
            } else if (input.equals("3")) {
                this.printPlaneInfo();             
            } else if (input.equals("x")) {
                break;
            }
        
        }
    }
            
    public void printPlanes() {
        this.currentAirport.printAirplanes();
    } 
    
    public void printFlights() {
        System.out.println(this.setOfFlights.printFlights());
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String input = this.reader.nextLine();        
        this.currentAirport.getSpecificAirplaneString(input);
    }
}