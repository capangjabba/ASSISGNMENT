package assisgnment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class MainUI {
    private JPanel rootPanel;
    private JPanel title;
    private JTable showTable;
    private JButton addDataButton;
    private JButton showDataButton;
    private JLabel movieNameLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel descriptionLabel;
    private JLabel castLabel;
    private JLabel releaseDateLabel;


    public MainUI(){
        createTable();
    }

    public JPanel getRootPanel() {

        return rootPanel;
    }
    private void createTable(){

        showTable.setModel(new DefaultTableModel(
                null,
                new String[]{"Id","Title","Description","Cast","Date"}
        ));
        DefaultTableModel model = (DefaultTableModel) showTable.getModel();
        String id = "";
        String title = "";
        String description = "";
        String cast = "";
        String date = "";
        try  {
            // CREATE CONNECTION WITH DATABASE
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/capang_screen_cinema", "root", "18102002");
            System.out.println("Database connected!");
            // CREATE STATEMENT FOR MYSQL
            Statement myStmt = connection.createStatement();
            // CREATE QUERY
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM movie");

            while (myRs.next()) {
                // add into rows
                id = myRs.getString("movie_id");
                title = myRs.getString("title");
                description = myRs.getString("description");
                cast = myRs.getString("cast");
                date = String.valueOf(myRs.getDate("release_date"));
                Object[]{id,title,description,cast,date};
            }

        } catch (
                SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }
}
