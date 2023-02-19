package Employee;

import java.sql.*;

public class Employee {
    int id;
    String name;
    int salary;
    static final String JDBC = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    static final String USER = "root";
    static final String PASS = "root";
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void insertData() {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName(JDBC);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO Employee(id, name, salary) " +
                    "VALUES (" + this.id + ", '" + this.name + "', " + this.salary + ")";
            stmt.executeUpdate(sql);
            System.out.println("Insert complete.");
            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
    public void DeleteData(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC);
            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Deleting records...");
            stmt = conn.createStatement();
            String sql = "DELETE FROM test.Employee WHERE id = "+this.id;
            stmt.executeUpdate(sql);

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch (Exception e) {
            // Handle errors
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public void UpdateData(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC);
            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating statement...");
            String sql = "UPDATE test.employee SET salary ="+this.salary+" WHERE id="+this.id;
            stmt = conn.createStatement();
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " rows updated");

        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public void ShowData(){
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
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
    }public void display(){
        System.out.println("id = "+this.id+"\nname = "+this.name+"\nsalary = "+this.salary);
    }
}
