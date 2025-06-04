public class star1 {
    public static void printTrianglePattern(int n) {
        // Outer for loop for rows
        for (int i = 0; i < n; i++) {
            // Inner for loop for columns (print stars up to i+1)
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String[] args) {
        int n = 6;
        printTrianglePattern(n);
    }
}
