package labs.lab3.prob2;

import labs.lab3.prob2.models.Apartment;
import labs.lab3.prob2.models.Building;
import labs.lab3.prob2.models.LandLordInfo;

public class Main {

	public static void main(String[] args) {
		Apartment[] apts0 = {
				new Apartment("Apt1", 600),
				new Apartment("Apt2", 700)
        };

		Apartment[] apts1 = {
				new Apartment("Apt3",500),
				new Apartment("Apt4",450)
		};

		Apartment[] apts2 = {
				new Apartment("Apt5", 1100),
				new Apartment("Apt6", 650)
        };

		Apartment[] apts3 = {
				new Apartment("Apt7", 6750),
				new Apartment("Apt8", 945)
		};

		Building[] bldgs = {
				new Building("A", 150, 400),
				new Building("B", 175, 900),
				new Building("C", 150, 300),
				new Building("D", 175, 775)
		};

        try {
            for(Apartment a : apts0) {
                bldgs[0].addApartment(a);
            }

            for(Apartment a : apts1) {
                bldgs[1].addApartment(a);
            }

            for(Apartment a : apts2) {
                bldgs[2].addApartment(a);
            }

            for(Apartment a : apts3) {
                bldgs[3].addApartment(a);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

		LandLordInfo landlord = new LandLordInfo();
		try {
            for(Building b: bldgs) {
                landlord.addBuilding(b);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

		System.out.printf(
                "Total Profit -> $%.2f%n",
                        landlord.calculateMonthlyProfit());
    }
}



