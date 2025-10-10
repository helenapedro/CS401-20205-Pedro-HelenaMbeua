package labs.lab4.partC;

import java.util.List;

public class HRPayrollApp {
    public static void main(String[] args) {
        // Using polymorphism + template method
        Employee e1 = new Hourly(20, 40);
        Employee e2 = new Salaried(4000);
        Employee e3 = new Commissioned(0.1, 2000);

        e1.print();
        e2.print();
        e3.print();
    }
}
