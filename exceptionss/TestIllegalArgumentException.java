package exceptionss;

public class TestIllegalArgumentException {
    public static void main(String[] args) {
        try {
            setAge(-5); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method that throws IllegalArgumentException for invalid age
    public static void setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150, got: " + age);
        }
        System.out.println("Age set to: " + age);
    }
}