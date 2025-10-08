
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCEX {
    public static void main(String[] args) {
        // Database credentials and URL
        String url = "jdbc:mysql://localhost:3306/pacchu";
        String username = "root";
        String password = "root";

        // SQL statement to create the table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "username VARCHAR(50) NOT NULL UNIQUE, " +
                "mobile_number VARCHAR(15) NOT NULL, " +
                "address VARCHAR(255) NOT NULL, " +
                "CONSTRAINT chk_mobile CHECK (mobile_number REGEXP '^[0-9]{10,15}$')" +
                ")";

        // SQL statement for inserting records
        String insertSQL = "INSERT INTO users (username, mobile_number, address) VALUES (?, ?, ?)";

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establish connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database!");

            // Create the table
            statement = connection.createStatement();
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created successfully (or already exists)!");

            // Prepare the insert statement
            preparedStatement = connection.prepareStatement(insertSQL);

            // Insert 5 records
            // Record 1
            preparedStatement.setString(1, "john_doe");
            preparedStatement.setString(2, "1234567890");
            preparedStatement.setString(3, "123 Main St, Springfield");
            preparedStatement.executeUpdate();

            // Record 2
            preparedStatement.setString(1, "jane_smith");
            preparedStatement.setString(2, "9876543210");
            preparedStatement.setString(3, "456 Oak Ave, Rivertown");
            preparedStatement.executeUpdate();

            // Record 3
            preparedStatement.setString(1, "alice_jones");
            preparedStatement.setString(2, "5551234567");
            preparedStatement.setString(3, "789 Pine Rd, Hillcity");
            preparedStatement.executeUpdate();

            // Record 4
            preparedStatement.setString(1, "bob_wilson");
            preparedStatement.setString(2, "4449876543");
            preparedStatement.setString(3, "101 Elm St, Laketown");
            preparedStatement.executeUpdate();

            // Record 5
            preparedStatement.setString(1, "emma_brown");
            preparedStatement.setString(2, "3334567890");
            preparedStatement.setString(3, "202 Birch Ln, Seaside");
            preparedStatement.executeUpdate();

            System.out.println("5 records inserted successfully!");

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}