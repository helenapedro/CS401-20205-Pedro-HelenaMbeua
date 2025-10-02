package labs.lab3.prob4;

import labs.lab3.prob4.models.*;

public class Driver {
	public static void main(String[] args) {
		Property[] objects = {
                new Condo(2),
                new House(900),
                new Trailer()
        };

        for (Property p : objects) {
            System.out.println(p.getClass().getSimpleName() + ": " + p.computeRent());
        }

		double totalRent = Admin.computeTotalRent(objects);
		System.out.printf("Total Rent -> $%.2f%n", totalRent);
	}
}
