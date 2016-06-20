import java.util.Scanner;
public class UI {
    private Scanner reader;
    
    public UI (Scanner reader) {
        this.reader = new Scanner(System.in);
        this.setOfFlights = new Flights();
    }
    
    public void airportPanel() {

        
        while(true) {
            System.out.println("Airport panel");
            System.out.println("--------------------");        

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            
            String input = this.reader;
            input = input.toLowerCase().trim();
            if (input.equals("1")) {
                addAirplane();
            } else if (input.equals("2")) {
                addFlight();
            } else if (input.equals("x")) {
                exitAirportPanel();
            }
        }

    }
    
    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String ID = this.reader;
        System.out.print("Give plane capacity: ");
        int capacity = this.reader;
        Airplane ID = new Airplane(ID,capacity);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String ID = this.reader;
        System.out.print("Give departure airport code: ");
        String depAirCode = this.reader;
        System.out.print("Give destination airport code: ");
        String destAirCode = this.reader;
        
    }

}