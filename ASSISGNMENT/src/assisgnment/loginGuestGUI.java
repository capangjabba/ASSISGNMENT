package assisgnment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class loginGuestGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField usernameTextField;
    private JLabel usernameLabel;
    private JPasswordField passwordTextField;
    private JLabel paswordLabel;
    private JButton loginButton;
    private JPanel titlePanel;
    private JLabel titleLabel;
    private JButton staffButton;
    private JButton registerButton;
    private JLabel loginLabel;

    public loginGuestGUI(String title){
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
                    ResultSet myRs = myStmt.executeQuery("SELECT * FROM guest");
                    String username = usernameTextField.getText();
                    String password = passwordTextField.getText();
                    // FIND EQUAL USERNAME AND PASSWORD
                    while (myRs.next()) {
                        if (myRs.getString("username").equals(username) && myRs.getString("password").equals(password)) {
                            System.out.println("WE IN"); // GOT INTO SYSTEM TESTING 123
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
        JFrame frame = new loginGuestGUI("CAPANG SCREEN CINEMA");
        frame.setVisible(true);

    }
}
