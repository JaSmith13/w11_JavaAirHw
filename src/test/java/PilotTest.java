import org.junit.Before;
import org.junit.Test;
import people.CrewMemberRank;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Starbuck", "XNX414386ABQ");
    }

    @Test
    public void canGetLicenseNumber(){
        assertEquals("XNX414386ABQ", pilot.getLicenseNumber());
    }

    @Test
    public void canGetRank(){
        assertEquals(CrewMemberRank.PILOT, pilot.getRank());
    }

    @Test
    public void canGetPromotedToCaptain(){
        pilot.promote();
        pilot.promote();
        assertEquals(CrewMemberRank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Flying Plane!!", pilot.flyPlane());
    }
}
