package labs.lab4.partC;

public class Salaried extends Employee{
    private double salary;

    public Salaried(double salary) {
        this.salary = salary;
    }

    @Override
    double calculateGrossPay(int month, int year) {
        return salary;
    }
}
