package labs.lab3.prob2.models;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double maintainanceCost;
    private double rentCost;

    public Building(double maintainanceCost, double rentCost) {
        this.maintainanceCost = maintainanceCost;
        this.rentCost = rentCost;
        apartments = new ArrayList<>();
    }

    public double generateCost() {
        // TODO
        return 0.0;
    }

    public double getMaintainanceCost() {
        return maintainanceCost;
    }

    public double getRentCost() {
        return rentCost;
    }
}
