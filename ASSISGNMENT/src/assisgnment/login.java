/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assisgnment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class login {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002")) {
            System.out.println("Database connected!");
        } catch (
                SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}
    

