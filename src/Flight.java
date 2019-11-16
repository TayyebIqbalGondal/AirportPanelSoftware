
public class Flight {

    private Plane planeId;
    private String departureAirport;
    private String destinationAirport;

    public Flight(Plane planeId, String departureAirport, String destinationAirport) {
        this.planeId = planeId;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public String toString() {
        return this.planeId + " (" + this.departureAirport + "-" + this.destinationAirport + ")";
    }
}
