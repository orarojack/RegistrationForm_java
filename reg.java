import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private JTextField firstNameField, lastNameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JComboBox<String> genderComboBox, countryComboBox;
    private JButton registrationButton;

    public RegistrationForm() {
        setTitle("GDSC MASENO REGISTRATION FORM");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(8, 2, 10, 10)); 
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel countryLabel = new JLabel("Country:");

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();

        String[] genders = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genders);

        String[] countries = {"USA", "Canada", "UK", "Australia", "Other"};
        countryComboBox = new JComboBox<>(countries);

        registrationButton = new JButton("Register");

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(genderLabel);
        add(genderComboBox);
        add(countryLabel);
        add(countryComboBox);
        add(new JLabel()); 
        add(registrationButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }
}
