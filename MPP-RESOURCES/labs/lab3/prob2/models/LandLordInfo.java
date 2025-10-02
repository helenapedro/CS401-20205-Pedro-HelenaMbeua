package labs.lab3.prob2.models;

import java.util.ArrayList;
import java.util.List;

public class LandLordInfo {
    private final List<Building> buildings;

    public LandLordInfo() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building b) {
        if (b == null)
            throw new NullPointerException("Cannot add a null building");
        buildings.add(b);
    }

    public double calculateMonthlyProfit() {
        double profit = 0.0;

        for (Building b : buildings) {
            profit += b.generateMonthlyProfit();
        }
        return profit;
    }
}
