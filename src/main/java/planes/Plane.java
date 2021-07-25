package planes;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public double getBaggageCapacity() {
        return this.planeType.getTotalWeight() / 2;
    }
}
