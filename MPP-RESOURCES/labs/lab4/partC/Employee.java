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
        return new Paycheck(gp, Tax.FICA, Tax.State, Tax.Local, Tax.Medicare, Tax.SocialSecurity); // Return a new immutable Paycheck
    }

    public void print() {
        System.out.println("Employee ID: " + empId);
        LocalDate now = LocalDate.now();
        System.out.println(calculateCompensation(now.getMonthValue(), now.getYear()));
        System.out.println("-------------------------");
    }
}
