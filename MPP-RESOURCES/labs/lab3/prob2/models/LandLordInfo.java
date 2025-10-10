package labs.lab3.prob2.models;

import java.util.*;

public class LandLordInfo {
    private final List<Building> buildings;

    public LandLordInfo() {
        buildings = new ArrayList<>();
    }

    public double calculateMonthlyProfit() {
        return buildings.stream()
                .filter(Objects::nonNull)
                .mapToDouble(Building::generateMonthlyProfit)
                .sum();
    }

    public void addBuilding(Building b) {
        if (b == null)
            throw new NullPointerException("Cannot add a null building");
        buildings.add(b);
    }
}
