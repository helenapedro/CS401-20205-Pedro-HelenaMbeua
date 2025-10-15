package labs.lab10.shortanswer.prob1B;

import java.util.function.Supplier;

public class RandomInnerClass {
    public static void main(String[] args) {
        Supplier<Double> ramdomSupplier = new Supplier<Double>() { // anonymous inner class
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.printf("Random number: %.2f%n", ramdomSupplier.get());
    }
}
