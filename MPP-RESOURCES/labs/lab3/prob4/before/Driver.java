package labs.lab3.prob4.before;

import labs.lab3.prob4.Admin;
import labs.lab3.prob4.models.*;

public class Driver {
	public static void main(String[] args) {
		Object[] objects = {
                new House(9000),
                new Condo(2),
                new Trailer()
        };

		//double totalRent = Admin.computeTotalRent(objects);
		//System.out.println(totalRent);
	}
}
