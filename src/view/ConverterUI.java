package view;
//imports

//import java.awt.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//starts frame

public class ConverterUI extends JFrame {

    //var setup
    private JPanel mainPanel;
    private JTextField userTextField;
    private JButton convertButtonFar;
    private JButton convertButtonIn;
    private JLabel fahrenheitLabel;
    private double userInput;
    private double farConvertNumber = 1.8;

//runs frame
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConverterUI frame = new ConverterUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    //components of application
    // Tanay and Dhruv S
    public ConverterUI() {
        //sets up bounds for windows
        getContentPane().setBackground(new Color(51, 49, 47));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 470);
        getContentPane().setLayout(null);

        //properties for input text field
        // Dhruv S
        JTextField userTextField = new JTextField("");
        userTextField.setFont(new Font("Impact", Font.PLAIN, 72));
        userTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        userTextField.setBounds(25, 22, 377, 67);
         getContentPane().add(userTextField);

         //properties for output label
        // Dhruv S
        JLabel output = new JLabel("Result");
        output.setFont(new Font("Impact", Font.PLAIN, 60));
        output.setHorizontalAlignment(SwingConstants.CENTER);
        output.setBounds(25, 300, 377, 67);
        output.setForeground(Color.WHITE);
        getContentPane().add(output);

        /* celsiusTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                celsiusTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                celsiusTextField.setFont(new Font("Impact", Font.PLAIN, 30));
                celsiusTextField.setText("Enter your email here:");
            }
        }); */

        //properties for instructions label
        // Dhruv S
        JLabel instrux = new JLabel("Enter a value input above");
        instrux.setFont(new Font("Impact", Font.PLAIN, 18));
        instrux.setHorizontalAlignment(SwingConstants.CENTER);
        instrux.setForeground(Color.WHITE);
        instrux.setBounds(18, 100, 377, 67);
        getContentPane().add(instrux);

        //creating button
        JButton convertButtonFar = new JButton("Fahrenheit");

        //color change once button is clicked
        // Dhruv S
        convertButtonFar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtonFar.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtonFar.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Dhruv S
        convertButtonFar.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtonFar.setFont(new Font("Impact", Font.PLAIN, 36));
        convertButtonFar.setOpaque(true);
        convertButtonFar.setForeground(Color.WHITE);
        convertButtonFar.setBackground(new Color(60, 174, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonFar.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                double fOutput = userInput*farConvertNumber + 32;
                String faOutput = String.valueOf(fOutput);

                output.setText(faOutput);
            }

        });
        //setting bounds for button
        convertButtonFar.setBounds(25, 185, 175, 67);
        getContentPane().add(convertButtonFar);

        // Create Object of button
        JButton convertButtonIn = new JButton("Inches");

        // Tanay Shah
        convertButtonIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtonIn.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtonIn.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Tanay Shah
        convertButtonIn.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtonIn.setFont(new Font("Impact", Font.PLAIN, 36));
        convertButtonIn.setOpaque(true);
        convertButtonIn.setForeground(Color.WHITE);
        convertButtonIn.setBackground(new Color(60, 174, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonIn.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                double inOutput = userInput*(12);
                String inStringOutput = String.valueOf(inOutput);

                output.setText(inStringOutput);
            }

        });
        //setting bounds for button
        convertButtonIn.setBounds(225, 185, 175, 67);
        getContentPane().add(convertButtonIn);
    }
}
