package planes;

import people.FlightAttendant;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<FlightAttendant> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String origin, String departureTime) {
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<FlightAttendant> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getEmptySeats(){
        int totalSeats = this.getPlane().getPlaneType().getCapacity();
        int takenSeats = this.passengers.size();
        int emptySeats = totalSeats - takenSeats;
        return emptySeats;
    }

    public void addCrewMember(FlightAttendant flightAttendant){
        cabinCrew.add(flightAttendant);
    }

    public void bookPassenger(Passenger passenger){
        int flightPassengerCapacity = this.getPlane().getPlaneType().getCapacity();
        if(this.passengers.size() < flightPassengerCapacity){
            passengers.add(passenger);
        }
    }

}
