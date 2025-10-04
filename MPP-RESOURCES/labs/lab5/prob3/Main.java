package labs.lab5.prob3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClosedCurve[] objects = {
                new Triangle(4,5.6),
                new Rectangle(3, 4),
                new Circle(3)};
        double sumArea = Arrays.stream(objects)
                .mapToDouble(ClosedCurve::computeArea)
                .sum();
        System.out.printf("Sum of the areas -> %.2f", sumArea);
    }
}
