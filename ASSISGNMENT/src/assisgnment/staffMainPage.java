package assisgnment;

import javax.swing.*;

public class staffMainPage extends JFrame{
    private JPanel mainPanel;
    private JButton registerStaffButton;
    private JButton movieButton;
    private JButton seatButton;
    private JButton fnbButton;
    private JLabel titleLabel;

    public staffMainPage(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
    public static void main(String[] args) {
        JFrame frame = new staffMainPage("CAPANG SCREEN CINEMA");
        frame.setVisible(true);

    }
}
