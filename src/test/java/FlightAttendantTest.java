import org.junit.Before;
import org.junit.Test;
import people.CrewMemberRank;
import people.FlightAttendant;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    FlightAttendant flightAttendant;

    @Before
    public void before(){
        flightAttendant = new FlightAttendant("Julianna");
    }

    @Test
    public void canGetName(){
        assertEquals("Julianna", flightAttendant.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewMemberRank.FLIGHTATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Brace For Impact", flightAttendant.relayMessage("Brace For Impact"));
    }
}
