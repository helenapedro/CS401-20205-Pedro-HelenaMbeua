package LecturesAndLabs.src.lesson04.handson;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public double getSalary() {
        return departments.stream()
                .mapToDouble(Department::getSalary)
                .sum();
    }

    public void print() {

    }
}
