package labs.lab10;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int s = 5, t = 10; // effective final
        Runnable r = () -> {
            int[][] products = new int[s][t];
            for (int i = 0; i < s; i++) {
                for (int j = i + 1; j < t; j++) {
                    products[i][j] = i * j;
                }
            }
        };

        boolean ignoreCase = true;  // efective final

        Comparator<String> comp = (ss, tt) -> {
            if (ignoreCase) {
                return ss.compareToIgnoreCase(tt);
            } else {
                return ss.compareTo(tt);
            }
        };

    }
}
