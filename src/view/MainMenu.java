
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
    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // Content Panel to add Label
        Container content = getContentPane();
        content.setBackground(new Color(100,100,255));

        // Menu Objects
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Added Dropdown Button for Suite
        JMenu mnSuite = new JMenu("Suite");
        menuBar.add(mnSuite);

        // Created Scientific Selector Button that creates new CalculatorUI object
        JMenuItem mntmCalculator = new JMenuItem("Scientific Calculator");
        mntmCalculator.addActionListener(e -> {
            CalculatorUI frame = new CalculatorUI();
            frame.setVisible(true);
        });
        mnSuite.add(mntmCalculator);

        // Created Temperature Converter Selector Button that creates new ConverterUI object
        JMenuItem mntmTempConv = new JMenuItem("Temperature Convertor");
        mntmTempConv.addActionListener(e -> {
            ConverterUI frame = new ConverterUI();
            frame.setVisible(true);
        });
        mnSuite.add(mntmTempConv);
      //  mnSuite.add(mntmPhysicsSolve);  <-- place holder for eventual physics solver feature



    }

}


