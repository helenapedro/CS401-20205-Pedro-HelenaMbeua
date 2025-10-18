package labs.lab13.prob5;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public final class MoreGenerics {
    private MoreGenerics() {}

    // Natural-order version (max reach for Comparable types)
    public static <T extends Comparable<? super T>> T secondSmallest(List<? extends T> list) {
        return secondSmallest(list, Comparator.naturalOrder());
    }

    // Comparator-based version (max reach for arbitrary types)
    public static <T> T secondSmallest(List<? extends T> list, Comparator<? super T> cmp) {
        if (list == null || cmp == null) {
            throw new IllegalArgumentException("list and comparator must not be null");
        }

        T min = null;
        T second = null;

        for (T x : list) {
            if (x == null) continue;

            if (min == null) {
                min = x;
            } else {
                int cMin = cmp.compare(x, min);
                if (cMin < 0) {
                    second = min;
                    min = x;
                } else if (cMin > 0) {
                    if (second == null || cmp.compare(x, second) < 0) {
                        second = x;
                    }
                }
            }
        }

        if (second == null) {throw new NoSuchElementException("Need at least two distinct (non-null) elements");
        }
        return second;
    }
}
