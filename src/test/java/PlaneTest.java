import org.junit.Before;
import org.junit.Test;
import planes.Plane;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.CESSNA172);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.CESSNA172, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(4, plane.getPlaneType().getCapacity());
    }

    @Test
    public void canGetBaggageWeightCapacity() {
        assertEquals("10.0Kg", plane.getBaggageCapacity() +"Kg");
    }
}
