package electricity.billing.system;
import java.sql.*;

public class database {
    Connection connection;
    Statement statement;

    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system","root","9870");
            statement = connection.createStatement();
            System.out.println("Connected to database successfully.");
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
