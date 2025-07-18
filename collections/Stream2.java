package collections;

import java.util.Arrays;
import java.util.List;

public class Stream2{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18, 31, 8, 11, 7, 55);
        int sum = numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println(sum);
    }
}