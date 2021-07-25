package planes;

public enum PlaneType {

    BOEING747(100, 20000),
    AIRBUS320(400, 80000),
    CESSNA172(4, 20);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, double totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}

