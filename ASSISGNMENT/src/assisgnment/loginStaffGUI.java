package assisgnment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class loginStaffGUI extends JFrame {

    private JPanel mainPanel;
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton guestButton;
    private JButton loginButton;
    private JPanel topPanel;
    private JLabel titleLabel;
    private JLabel loginLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public loginStaffGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try  {
                    // CREATE CONNECTION WITH DATABASE
                    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
                    System.out.println("Database connected!");
                    // CREATE STATEMENT FOR MYSQL
                    Statement myStmt = connection.createStatement();
                    // CREATE QUERY
                    ResultSet myRs = myStmt.executeQuery("SELECT * FROM staff");
                    String username = usernameTextField.getText();
                    String password = passwordTextField.getText();
                    // FIND EQUAL USERNAME AND PASSWORD
                    while (myRs.next()) {
                        if (myRs.getString("username").equals(username) && myRs.getString("password").equals(password)) {
                            System.out.println("WE IN"); // GOT INTO SYSTEM
                        }
                    }

                } catch (
                        SQLException a) {
                    throw new IllegalStateException("Cannot connect the database!", a);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new loginStaffGUI("CAPANG SCREEN CINEMA");
        frame.setVisible(true);

    }
}
