 
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
    private JTextField PowerFieldField;
    private JButton calculateButton;
    private JLabel initialLabel;
    private JLabel answerLabel;
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
        setBounds(100, 100, 450, 470);
        getContentPane().setLayout(null);

        //properties for input text field
        // Dhruv S
        JTextField coefficientField = new JTextField("");
        coefficientField.setFont(new Font("Impact", Font.PLAIN, 72));
        coefficientField.setHorizontalAlignment(SwingConstants.RIGHT);
        coefficientField.setBounds(25, 22, 377, 67);
        getContentPane().add(coefficientField);



        //properties for output label
        // Dhruv S

        JLabel initialLabel = new JLabel("6x^2");
        initialLabel.setFont(new Font("Impact", Font.PLAIN, 72));
        initialLabel.setHorizontalAlignment(SwingConstants.CENTER);
        initialLabel.setBounds(25, 300, 377, 67);
        initialLabel.setForeground(Color.WHITE);
        getContentPane().add(initialLabel);

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


        });
        //setting bounds for button
        calculateButton.setBounds(25, 170, 377, 67);
        getContentPane().add(calculateButton);
    }
}
