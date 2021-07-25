import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.Pilot;
import planes.Flight;
import planes.FlightManager;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){

        plane = new Plane(PlaneType.CESSNA172);
        pilot = new Pilot("Adama", "BG18102004");
        flight = new Flight(pilot, plane, "BG124", "NCP", "JFK)", "10:30");
        passenger = new Passenger("Number Six", 2);
        flight.bookPassenger(passenger);
        flightManager = new FlightManager(flight);
    }

    @Test
    //plane capacity should be 2.5Kg
    public void canGetPersonalBaggageAllowance() {
        assertEquals(2.5, flightManager.getPersonalBaggageAllowance(), 0.01);
    }

    @Test
    //current baggage weight should be 5kg
    public void canGetCurrentBookedBaggageWeight() {
        assertEquals(5, flightManager.getCurrentBaggageWeightOnFlight(), 0.01);
    }

    @Test
    //remaining weight should be 5kg
    public void canGetRemainingWeightAllowance() {
        assertEquals(5, flightManager.getRemainingWeightAllowance(), 0.01);
    }
}
