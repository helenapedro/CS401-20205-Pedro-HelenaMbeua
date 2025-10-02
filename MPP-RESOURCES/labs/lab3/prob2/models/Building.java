package labs.lab3.prob2.models;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private final List<Apartment> apartments;
    private final double maintenanceCost;

    public Building(double maintenanceCost, double aptRent) {
        this.maintenanceCost = maintenanceCost;
        apartments = new ArrayList<>();
    }

    public void addApartment(Apartment a) {
        if (a == null)
            throw new NullPointerException("Cannot add a null apartment");
        apartments.add(a);
    }

    public double generateMonthlyProfit() {
        double sum = sumAllApRent();
        return sum - maintenanceCost;
    }

    private double sumAllApRent() {
        double sum = 0.0;
        for (Apartment a : apartments) {
            if (a != null) {
                double rent = a.rent();
                sum += rent;
            }
        }
        return sum;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }
}
