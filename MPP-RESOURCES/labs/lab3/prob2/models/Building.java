package labs.lab3.prob2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {
    private final List<Apartment> apartments;
    private final double monthlyMaintenanceCost;
    private final double baseRent;

    public Building(double monthlyMaintenanceCost, double baseRent) {
        this.monthlyMaintenanceCost = monthlyMaintenanceCost;
        this.baseRent = baseRent;
        apartments = new ArrayList<>();
    }

    public double generateMonthlyProfit() {
        if (apartments.isEmpty()) return 0;
        return sumAllAptRent() + baseRent - monthlyMaintenanceCost;
    }

    public void addApartment(Apartment a) {
        if (a == null)
            throw new NullPointerException("Cannot add a null apartment");
        apartments.add(a);
    }

    private double sumAllAptRent() {
        return apartments.stream()
                .filter(Objects::nonNull)
                .mapToDouble(Apartment::monthlyRent)
                .sum();
    }

    public double getMonthlyMaintenanceCost() {
        return monthlyMaintenanceCost;
    }
}
