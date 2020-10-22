package view;

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
import control.MathCalc.OPERATOR;

public class ConverterUI extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

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

    public ConverterUI() {
        getContentPane().setBackground(new Color(51, 49, 47));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 470);
        getContentPane().setLayout(null);

        JTextField celsiusTextField = new JTextField("");
        celsiusTextField.setFont(new Font("Impact", Font.PLAIN, 72));
        celsiusTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        celsiusTextField.setBounds(18, 6, 377, 67);
         getContentPane().add(celsiusTextField);

        celsiusTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                celsiusTextField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                celsiusTextField.setFont(new Font("Impact", Font.PLAIN, 30));
                celsiusTextField.setText("Enter your email here:");
            }
        });


        JLabel instrux = new JLabel("Enter Celsius input above");
        instrux.setFont(new Font("Impact", Font.PLAIN, 18));
        instrux.setHorizontalAlignment(SwingConstants.RIGHT);
        instrux.setBounds(18, 100, 377, 67);
        getContentPane().add(instrux);

        JButton convertButton = new JButton("Convert");

        convertButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                convertButton.setBackground(Color.PINK);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                convertButton.setBackground(new Color(60, 174, 163));
            }
        });
        convertButton.setBorder(new MatteBorder(4, 4, 4, 4, Color.WHITE));
        convertButton.setOpaque(true);
        convertButton.setForeground(Color.BLACK);
        convertButton.setBackground(new Color(60, 174, 163));
        convertButton.addActionListener(e -> {

        });
        convertButton.setBounds(175, 200, 75, 40);
        getContentPane().add(convertButton);

    }

}
