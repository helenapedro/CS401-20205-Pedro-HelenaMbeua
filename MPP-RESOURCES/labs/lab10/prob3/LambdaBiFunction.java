package labs.lab10.prob3;

import java.util.*;
import java.util.function.*;

public class LambdaBiFunction {
    public static void main(String[] args) {
        /*(x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };*/

        // Lambda assigned to a BiFunction<Double, Double, List<Double>>
        BiFunction<Double, Double, List<Double>> func = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

        // Apply the function to arguments (2.0, 3.0)
        List<Double> result = func.apply(2.0, 3.0);

        // Print the result
        System.out.println(result);
    }
}
