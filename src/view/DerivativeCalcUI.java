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

public class DerivativeCalcUI extends JFrame {

    //var setup
    private JPanel mainPanel;
    private JTextField coefficientField;
    private JTextField powerField;
    private JButton calculateButton;
    private JLabel initialLabel;
    private JLabel answerLabel;
    private JLabel infoLabel;
    private JLabel infoLabel2;
    private JLabel instruxLabel;
    private JLabel instruxLabel2;
    //private double celsiusInput;

    //runs frame
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                DerivativeCalcUI frame = new DerivativeCalcUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    //components of application
    //Dhruv S
    public DerivativeCalcUI() {
        //sets up bounds for windows
        getContentPane().setBackground(new Color(51, 49, 47));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 550);
        getContentPane().setLayout(null);

        //properties for input text field
        // Dhruv S

        JLabel instruxLabel = new JLabel("Enter coefficient below:");
        instruxLabel.setFont(new Font("Impact", Font.PLAIN, 18));
        instruxLabel.setHorizontalAlignment(SwingConstants.CENTER);
        instruxLabel.setBounds(25, 10, 377, 30);
        instruxLabel.setForeground(Color.WHITE);
        getContentPane().add(instruxLabel);

        JTextField coefficientField = new JTextField("");
        coefficientField.setFont(new Font("Impact", Font.PLAIN, 40));
        coefficientField.setHorizontalAlignment(SwingConstants.RIGHT);
        coefficientField.setBounds(25, 50, 377, 50);
        getContentPane().add(coefficientField);

        JLabel instruxLabel2 = new JLabel("Enter power below:");
        instruxLabel2.setFont(new Font("Impact", Font.PLAIN, 18));
        instruxLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        instruxLabel2.setBounds(25, 110, 377, 30);
        instruxLabel2.setForeground(Color.WHITE);
        getContentPane().add(instruxLabel2);

        JTextField powerField = new JTextField("");
        powerField.setFont(new Font("Impact", Font.PLAIN, 40));
        powerField.setHorizontalAlignment(SwingConstants.RIGHT);
        powerField.setBounds(25, 140, 377, 50);
        getContentPane().add(powerField);


        //properties for output label
        // Dhruv S
        JLabel infoLabel = new JLabel("Initial term input:");
        infoLabel.setFont(new Font("Impact", Font.PLAIN, 25));
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setBounds(25, 290, 377, 67);
        infoLabel.setForeground(Color.WHITE);
        getContentPane().add(infoLabel);

        JLabel initialLabel = new JLabel("6x^2");
        initialLabel.setFont(new Font("Impact", Font.PLAIN, 30));
        initialLabel.setHorizontalAlignment(SwingConstants.CENTER);
        initialLabel.setBounds(25, 340, 377, 67);
        initialLabel.setForeground(Color.WHITE);
        getContentPane().add(initialLabel);

        JLabel infoLabel2 = new JLabel("Derivative Output:");
        infoLabel2.setFont(new Font("Impact", Font.PLAIN, 25));
        infoLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel2.setBounds(25, 390, 377, 67);
        infoLabel2.setForeground(Color.WHITE);
        getContentPane().add(infoLabel2);

        JLabel answerLabel = new JLabel("");
        answerLabel.setFont(new Font("Impact", Font.PLAIN, 50));
        answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        answerLabel.setBounds(25, 440, 377, 67);
        answerLabel.setForeground(Color.WHITE);
        getContentPane().add(answerLabel);

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

        //creating button
        JButton calculateButton = new JButton("Calculate");

        //color change once button is clicked
        // Dhruv S
        calculateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateButton.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                calculateButton.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Dhruv S
        calculateButton.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        calculateButton.setFont(new Font("Impact", Font.PLAIN, 50));
        calculateButton.setOpaque(true);
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setBackground(new Color(60, 174, 163));

        //logic code once button is clicked
        // Tanay S
        calculateButton.addActionListener(e -> {
            double coefficient = Double.parseDouble((coefficientField.getText()));
            double power = Double.parseDouble(((powerField.getText())));
            double derivativePower = power-1;
            double derivativeCoefficient = coefficient*power;
            initialLabel.setText(coefficient + "x^" + power);
            answerLabel.setText(derivativeCoefficient + "x^" + derivativePower);


        });
        //setting bounds for button
        calculateButton.setBounds(25, 210, 377, 67);
        getContentPane().add(calculateButton);
    }
}
