package labs.lab10.prob1.prob1B;

import java.util.function.Supplier;

public class RandomLambda {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.printf("Random number: %.2f%n", randomSupplier.get());
    }
}
