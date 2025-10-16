package labs.lab11.part1.prob3.partA;

import java.util.stream.Stream;

public class PrimeStreamA {
    // Infinite stream of primes
    final Stream<Integer> primes = Stream.iterate(2, n -> nextPrime(n));

    // generates the next prime number given the previous one.
    private static int nextPrime(int after) {
        int candidate = after + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
