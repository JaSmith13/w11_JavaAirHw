package planes;

import people.Passenger;

import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double getPersonalBaggageAllowance(){
        double totalPlaneWeightCapacity = flight.getPlane().getPlaneType().getTotalWeight();
        int passengerCapacity = flight.getPlane().getPlaneType().getCapacity();
        return (totalPlaneWeightCapacity / 2) / passengerCapacity;
    }

    public int getTotalBagsOnFlight(){
        int numberOfBagsOnFlight = 0;
         ArrayList<Passenger> passengersOnFlight = flight.getPassengers();
        for (Passenger passenger : passengersOnFlight){
            numberOfBagsOnFlight += passenger.getNoOfBags();
        }
        return numberOfBagsOnFlight;
    }

    public double getCurrentBaggageWeightOnFlight(){
        return getPersonalBaggageAllowance() * getTotalBagsOnFlight();
    }

    public double getRemainingWeightAllowance(){
        double totalPlaneBaggageCapacity = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        return totalPlaneBaggageCapacity - getCurrentBaggageWeightOnFlight();
    }

    //    calculate how much baggage weight should be reserved for each passenger for a flight
//    calculate how much baggage weight is booked by passengers of a flight
//    calculate how much overall weight reserved for baggage remains for a flight
}

