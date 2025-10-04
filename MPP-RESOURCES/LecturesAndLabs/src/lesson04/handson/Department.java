package LecturesAndLabs.src.lesson04.handson;

import java.util.List;

public class Department {
    private String name, location;
    private List<Position> positions;

    public double getSalary() {
        return positions.stream()
                .mapToDouble(Position::getSalary)
                .sum();
    }
}
