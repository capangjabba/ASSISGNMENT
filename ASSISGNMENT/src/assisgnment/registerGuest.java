package assisgnment;

import java.sql.*;
import java.util.Scanner;

public class registerGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try  {
            // CREATE CONNECTION WITH DATABASE
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
            System.out.println("Database connected!");
            // CREATE STATEMENT FOR MYSQL
            Statement myStmt = connection.createStatement();

            System.out.print("Enter username : ");
            String username = input.next();
            System.out.print("Enter password : ");
            String password = input.next();
            // CREATE QUERY INSTRUCTIONS
            String sql = "INSERT INTO guest "
                    + "(username,password)"
                    + "values ('"+username+"','"+password+"')";
            myStmt.executeUpdate(sql);
            System.out.println("You are now registered. ");

        } catch (
                SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
