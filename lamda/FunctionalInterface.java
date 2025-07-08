package lamda;

import java.util.function.Function;

public class FunctionalInterface {
static Function<Integer, Double> con = (num) -> Math.sqrt(num);
    public static void main(String[] args) {
        System.out.println(con.apply(4)); // Output: 2.0
    }
}
