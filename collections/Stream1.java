package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("rahul", "gandu", "bhaskar", "ananda");
        List<String> newNames = enames.stream()
                .filter(ename -> ename.startsWith("r"))
                .collect(Collectors.toList()); // Using Collectors.toList()
        System.out.println(newNames); // Output: [rahul]
        
    }
}