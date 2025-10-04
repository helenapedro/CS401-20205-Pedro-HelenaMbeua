package labs.lab4.partC;

public class Hourly extends Employee{
    private double hourlyWage, hoursPerWeek;

    public Hourly(double hourlyWage, double hoursPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double calculateGrossPay(int month, int year) {
        return 4 * hourlyWage * hoursPerWeek;
    }
}
