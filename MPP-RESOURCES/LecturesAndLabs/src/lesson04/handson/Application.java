package LecturesAndLabs.src.lesson04.handson;

public class Application {
    static void main() {
        Company company = new Company();
        double salary = company.getSalary();
        System.out.printf("Total Salary -> $%.2f%n", salary);
    }
}
