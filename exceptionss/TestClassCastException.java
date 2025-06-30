package exceptionss;

public class TestClassCastException {
    public static void main(String[] args) {
        try {
            Object obj = "Hello, World!"; // Object is a String
            Integer number = (Integer) obj; // Attempt to cast String to Integer
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}