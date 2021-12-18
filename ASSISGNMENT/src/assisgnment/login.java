/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assisgnment;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try  {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
            System.out.println("Database connected!");
            Statement myStmt = connection.createStatement();
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM guest");
            System.out.print("Enter username : ");
            String username = input.next();
            System.out.print("Enter password : ");
            String password = input.next();
            while (myRs.next()) {
                if (myRs.getString("username").equals(username) && myRs.getString("password").equals(password)) {
                    System.out.println("WE IN"); // got into system
                }
            }

        } catch (
                SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
    

