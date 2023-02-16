package Employee;

import java.sql.*;

public class ShowDataFromDatabase {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(dbUrl, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Employee")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");

                System.out.printf("ID: %d, Name: %s, Salary: %d\n", id, name, salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
