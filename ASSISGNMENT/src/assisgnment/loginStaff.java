package assisgnment;

import java.sql.*;
import java.util.Scanner;

public class loginStaff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try  {
            // CREATE CONNECTION WITH DATABASE
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
            System.out.println("Database connected!");
            // CREATE STATEMENT FOR MYSQL
            Statement myStmt = connection.createStatement();
            // CREATE QUERY
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM staff");
            System.out.print("Enter username : ");
            String username = input.next();
            System.out.print("Enter password : ");
            String password = input.next();
            // FIND EQUAL USERNAME AND PASSWORD
            while (myRs.next()) {
                if (myRs.getString("username").equals(username) && myRs.getString("password").equals(password)) {
                    System.out.println("WE IN"); // GOT INTO SYSTEM
                }
            }

        } catch (
                SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
