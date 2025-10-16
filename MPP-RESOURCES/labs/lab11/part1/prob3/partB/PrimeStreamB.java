package labs.lab11.part1.prob3.partB;

import java.util.stream.Stream;

/*
B. Then create a way to call this stream multiple times
(e.g., printFirstNPrimes(10) and printFirstNPrimes(5)).
*/

public class PrimeStreamB {
    public static void main(String[] args) {
        PrimeStreamB ps = new PrimeStreamB();
        ps.printFirstNPrimes(10);
        System.out.println("=====");
        ps.printFirstNPrimes(5);
    }
    // Supplier of new prime streams
    private Stream<Integer> getPrimes() {
        return Stream.iterate(2, PrimeStreamB::nextPrime);
    }

    public void printFirstNPrimes(long n) {
        getPrimes().limit(n).forEach(System.out::println);
    }

    // ====================Helper functions==============================
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
