package labs.lab11.part1.prob3.partB;

import java.util.stream.Stream;

public class PrimeStreamB {
    public static void main(String[] args) {
        PrimeStreamB ps = new PrimeStreamB();
        ps.printFirstNPrimes(10);
        System.out.println("=====");
        ps.printFirstNPrimes(5);
    }
    // Supplier of new prime streams
    private Stream<Integer> getPrimes() {
        return Stream.iterate(2, n -> nextPrime(n));
    }

    public void printFirstNPrimes(long n) {
        getPrimes().limit(n).forEach(System.out::println);
    }

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
