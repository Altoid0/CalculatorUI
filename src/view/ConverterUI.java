package view;
//imports

//import java.awt.*;

import control.ConverterControl;
import model.ConverterModel;

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
import java.lang.*;
import control.ConverterControl.CONVERT;
import model.ConverterModel;

//starts frame

public class ConverterUI extends JFrame {

    //var setup
    private JPanel mainPanel;
    private JTextField userTextField;
    private JButton convertButtonFar;
    private JButton convertButtonIn;
    private JButton convertButtonHex;
    private JButton convertButtonDec;
    private JButton convertButtonCm;
    private JButton convertButtontoIn;
    private JLabel fahrenheitLabel;
    private double userInput;
    private String userInputString;
    private double farConvertNumber = 1.8;
    private CONVERT convertOp;

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
        setBounds(100, 100, 600, 500);
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
        output.setBounds(25, 310, 377, 67);
        output.setForeground(Color.WHITE);
        getContentPane().add(output);

        //creating button
        JButton convertButtonFar = new JButton("C° → F°");

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
                convertOp = CONVERT.FAHRENHEIT;
                ConverterModel finalAnswer = new ConverterModel(userInput, convertOp);
                String faOutput = String.valueOf(finalAnswer.converterModelAnswer);
                output.setText(faOutput);
            }

        });
        //setting bounds for button
        convertButtonFar.setBounds(25, 100, 180, 67);
        getContentPane().add(convertButtonFar);

        // Create Object of button
        JButton convertButtonIn = new JButton("Ft → In");

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
        convertButtonIn.setBackground(new Color(60, 185, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonIn.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                convertOp = CONVERT.FTINCHES;
                ConverterModel finalAnswer = new ConverterModel(userInput, convertOp);
                String inStringOutput = String.valueOf(finalAnswer.converterModelAnswer);
                output.setText(inStringOutput);
            }

        });
        //setting bounds for button
        convertButtonIn.setBounds(215, 100, 185, 67);
        getContentPane().add(convertButtonIn);


        // Create Object of button
        JButton convertButtonHex = new JButton("Decimal → Hex");

        // Tanay Shah
        convertButtonHex.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtonHex.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtonHex.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Tanay Shah
        convertButtonHex.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtonHex.setFont(new Font("Impact", Font.PLAIN, 26));
        convertButtonHex.setOpaque(true);
        convertButtonHex.setForeground(Color.WHITE);
        convertButtonHex.setBackground(new Color(60, 185, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonHex.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                int userInputInt = (int)userInput;
                String hexOutput = Integer.toHexString(userInputInt);
                String hexStringOutput = String.valueOf(hexOutput);
                output.setText(hexStringOutput);
            }

        });
        //setting bounds for button
        convertButtonHex.setBounds(215, 175, 185, 67);
        getContentPane().add(convertButtonHex);


        // Create Object of button
        JButton convertButtonDec = new JButton("Hex → Decimal");

        // Tanay Shah
        convertButtonDec.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtonDec.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtonDec.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Tanay Shah
        convertButtonDec.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtonDec.setFont(new Font("Impact", Font.PLAIN, 26));
        convertButtonDec.setOpaque(true);
        convertButtonDec.setForeground(Color.WHITE);
        convertButtonDec.setBackground(new Color(60, 185, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonDec.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInputString = userTextField.getText();
                int hexToDecimal = Integer.parseInt(userInputString,16);
                String decStringOutput = String.valueOf(hexToDecimal);

                output.setText(decStringOutput);
            }

        });
        //setting bounds for button
        convertButtonDec.setBounds(25, 175, 180, 67);
        getContentPane().add(convertButtonDec);

        // Create Object of button
        JButton convertButtonCm = new JButton("In → Cm");

        // Tanay Shah
        convertButtonCm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtonCm.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtonCm.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Tanay Shah
        convertButtonCm.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtonCm.setFont(new Font("Impact", Font.PLAIN, 26));
        convertButtonCm.setOpaque(true);
        convertButtonCm.setForeground(Color.WHITE);
        convertButtonCm.setBackground(new Color(60, 185, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtonCm.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                convertOp = CONVERT.CENTIMETERS;
                ConverterModel finalAnswer = new ConverterModel(userInput, convertOp);
                String cmStringOutput = String.valueOf(finalAnswer.converterModelAnswer);
                output.setText(cmStringOutput);
            }

        });
        //setting bounds for button
        convertButtonCm.setBounds(25, 250, 180, 67);
        getContentPane().add(convertButtonCm);

        // Create Object of button
        JButton convertButtontoIn = new JButton("Cm → In");

        // Tanay Shah
        convertButtontoIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButtontoIn.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButtontoIn.setBackground(new Color(60, 174, 163));
            }
        });

        //properties for button
        // Tanay Shah
        convertButtontoIn.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButtontoIn.setFont(new Font("Impact", Font.PLAIN, 26));
        convertButtontoIn.setOpaque(true);
        convertButtontoIn.setForeground(Color.WHITE);
        convertButtontoIn.setBackground(new Color(60, 185, 163));

        //logic code once button is clicked
        // Tanay S
        convertButtontoIn.addActionListener(e -> {
            //if else statement to see if text field is blank (Gautam added)
            if (userTextField.getText().equals("")) {
                output.setText("Result");
            } else {
                //business logic code to convert
                userInput = Double.parseDouble((userTextField.getText()));
                convertOp = CONVERT.CMINCHES;
                ConverterModel finalAnswer = new ConverterModel(userInput, convertOp);
                String cmStringOutput = String.valueOf(finalAnswer.converterModelAnswer);
                output.setText(cmStringOutput);
            }

        });
        //setting bounds for button
        convertButtontoIn.setBounds(215, 250, 180, 67);
        getContentPane().add(convertButtontoIn);
    }
}
