package com.edmontheprogrammer;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Login extends JFrame {

    private JTextField username;
    private JPasswordField passwordField;

    public Login() {
        super("Login");
        setLayout(new FlowLayout());

        username = new JTextField(10);
        add(username);

        passwordField = new JPasswordField("edmontheprogrammer");
        add(passwordField);

        Login_Handler Login_handler_Object = new Login_Handler();
        username.addActionListener(Login_handler_Object);
        passwordField.addActionListener(Login_handler_Object);
    }

    private class Login_Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String string = "";

            if (e.getSource() == username) {
                string = String.format(" Username : %s", e.getActionCommand());
            } else if (e.getSource() == passwordField) {
                string = String.format("Password : %s", e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);
        }

    }
}


