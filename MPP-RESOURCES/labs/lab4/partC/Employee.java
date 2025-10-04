package labs.lab4.partC;

import java.time.LocalDate;
import java.util.UUID;

abstract public class Employee {
    private String empId;

    public Employee() {
        this.empId = UUID.randomUUID().toString();
    }


    abstract double calculateGrossPay(int month, int year);

    // Template method
    public Paycheck calculateCompensation(int month, int year) {
        double gp = calculateGrossPay(month, year);
        // Ask subclass for gross pay -> calcGrossPay() -> gp
        double fica = 0.23 * gp;
        double state = 0.05 * gp;
        double local = 0.01 * gp;
        double medicare = 0.03 * gp;
        double socialSecurity = 0.075 * gp;

        return new Paycheck(gp, fica, state, local, medicare, socialSecurity); // Return a new immutable Paycheck
    }

    public void print(int month, int year) {
        System.out.println("Employee ID: " + empId);
        Paycheck p = calculateCompensation(month, year);
        p.print();
        System.out.println("-------------------------");
    }
}
