package LecturesAndLabs.src.lesson04.handson;

import java.util.Date;

public class Employee {
    private String employeeId,
            firstName,
            middLeInitial,
            lastName,
            ssn;
    private Date birthDate;
    private double salary;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddLeInitial() {
        return middLeInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }
}
