import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Samuel", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Samuel", passenger.getName());
    }

    @Test
    public void passengerHasNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }

}
