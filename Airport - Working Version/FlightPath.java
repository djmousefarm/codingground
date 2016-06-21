public class FlightPath {
    private Airplane airplane;
    private String departureAirport;
    private String destinationAirport;
    
    public FlightPath (Airplane airplane, String departureAirport, String destinationAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }
    
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.destinationAirport + ")";
    }
}