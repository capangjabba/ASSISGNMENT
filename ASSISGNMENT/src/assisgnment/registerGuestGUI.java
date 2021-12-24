package assisgnment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class registerGuestGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPanel registerTitlePanel;
    private JLabel registerTitle;
    private JLabel registerTitle2;
    private JButton loginButton;
    private JButton registerButton;

    public registerGuestGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try  {
                    // CREATE CONNECTION WITH DATABASE
                    Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
                    System.out.println("Database connected!");
                    // CREATE STATEMENT FOR MYSQL
                    Statement myStmt = connection.createStatement();

                    String username = usernameTextField.getText();
                    String password = passwordTextField.getText();
                    // CREATE QUERY INSTRUCTIONS
                    String sql = "INSERT INTO guest "
                            + "(username,password)"
                            + "values ('"+username+"','"+password+"')";
                    myStmt.executeUpdate(sql);
                    System.out.println("You are now registered. ");

                } catch (
                        SQLException a) {
                    throw new IllegalStateException("Cannot connect the database!", a);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new registerGuestGUI("CAPANG SCREEN CINEMA");
        frame.setVisible(true);

    }
}
