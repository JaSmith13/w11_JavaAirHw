import org.junit.Before;
import org.junit.Test;
import people.FlightAttendant;
import people.Passenger;
import people.Pilot;
import planes.Flight;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    Passenger passenger;
    Passenger passenger2;
    FlightAttendant cabinCrew;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA172);
        pilot = new Pilot("Adama", "BG18102004");
        flight = new Flight(pilot, plane, "BG124", "NCP", "JFK)", "10:30");
        passenger = new Passenger("Number Six", 2);
        passenger2 = new Passenger("Number One", 2);
        cabinCrew = new FlightAttendant("Gaius");
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        flight.addCrewMember(cabinCrew);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.CESSNA172, flight.getPlane().getPlaneType());
    }

    @Test
    public void getEmptySeats(){
        assertEquals(3, flight.getEmptySeats());
    }

    @Test
    public void canAddPassenger(){
        Passenger passenger3 = new Passenger("Number Two", 2);
        flight.bookPassenger(passenger3);
        assertEquals(3,flight.getPassengers().size());
    }

    @Test
    public void cannotAddPassengerIfPlaneIsFull(){
        //plane capacity is 4, passenger5 should not be added
        Passenger passenger3 = new Passenger("Number Two", 2);
        Passenger passenger4 = new Passenger("Number Three", 2);
        Passenger passenger5 = new Passenger("Number Four", 2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
        assertEquals(4, flight.getPassengers().size());
    }
}


