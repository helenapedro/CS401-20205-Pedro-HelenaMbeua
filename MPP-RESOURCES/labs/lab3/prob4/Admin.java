package labs.lab3.prob4;

import labs.lab3.prob4.models.Property;

public class Admin {
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property p : properties) {
            if (p != null) {
                totalRent += p.computeRent();
            }
        }
        return totalRent;
    }
}
