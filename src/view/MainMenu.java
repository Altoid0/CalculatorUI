
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Tanay and Dhruv S
public class MainMenu extends JFrame {
    /**
     Launch the MainMenu to display sub features
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainMenu frame = new MainMenu();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */

    // Tanay and Dhruv S
    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // Content Panel to add Label
        // Tanay and Dhruv S
        Container content = getContentPane();
        content.setBackground(new Color(100,100,255));

        // Menu Objects
        // Tanay and Dhruv S
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Added Dropdown Button for Suite
        // Tanay and Dhruv S
        JMenu mnSuite = new JMenu("Suite");
        menuBar.add(mnSuite);

        // Created Scientific Selector Button that creates new CalculatorUI object
        // Dhruv K
        JMenuItem mntmCalculator = new JMenuItem("Scientific Calculator");
        mntmCalculator.addActionListener(e -> {
            CalculatorUI frame = new CalculatorUI();
            frame.setVisible(true);
        });
        mnSuite.add(mntmCalculator);

        // Created Temperature Converter Selector Button that creates new ConverterUI object
        // Dhruv K
        JMenuItem mntmTempConv = new JMenuItem("Temperature Convertor");
        mntmTempConv.addActionListener(e -> {
            ConverterUI frame = new ConverterUI();
            frame.setVisible(true);
        });
        mnSuite.add(mntmTempConv);

        JMenuItem mntmDerivativeCalc = new JMenuItem("Derivative Calculator");
        mntmDerivativeCalc.addActionListener(e -> {
            DerivativeCalcUI frame = new DerivativeCalcUI();
            frame.setVisible(true);
        });
        mnSuite.add(mntmDerivativeCalc);
      //  mnSuite.add(mntmPhysicsSolve);  <-- place holder for eventual physics solver feature



    }

}


